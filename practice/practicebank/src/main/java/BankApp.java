import db.DBConnection;
import model.account.Account;
import model.account.AccountDAO;
import model.transaction.Transaction;
import model.transaction.TransactionDAO;

import java.sql.Connection;
import java.sql.SQLException;


public class BankApp {
    public static void main(String[] args) {
        Connection connection = DBConnection.getInstance();
        AccountDAO accountDAO = new AccountDAO(connection);
        TransactionDAO transactionDAO = new TransactionDAO(connection);


            // 이체 요청 정보
        String wAccountPassword = "1234";
        int wAccountNumber = 3333;
        int dAccountNumber = 2222;
        int amount = 300;

            //0원 이체 확인하기(컨트롤러에서 체크)
        if(amount <= 0){
            System.out.println("[유효성 오류] 0원 이하의 금액을 이체할 수 없습니다");
            return;

        }

        //----------------- 트랜잭션 시작
        try {
            connection.setAutoCommit(false);

            //계좌 찾기 (서비스에서 체크)
            Account wAccount = accountDAO.getAccountBynumber(wAccountNumber);
            Account dAccount = accountDAO.getAccountBynumber(dAccountNumber);

            //계좌 존재 확인(서비스에서 체크)
            if(wAccount == null){
                throw new RuntimeException("출금 계좌가 존재하지 않습니다.");
            }
            if(dAccount == null){
                throw new RuntimeException("입금 계좌가 존재하지 않습니다");
            }

            //계좌 비밀번호 확인(서비스에서 체크)
            if(!wAccount.getAccountPassword().equals(wAccountPassword)){
                throw new RuntimeException("출금 계좌의 비밀번호가 올바르지 않습니다.");
            }

            //계좌 잔액 확인(서비스에서 체크)
            if(wAccount.getAccountBalance() < amount){
                throw new RuntimeException("출금 계좌의 잔액이 부족합니다.");
            }

            // 계좌 업데이트 (서비스에서 업데이트)
            int wBalance = wAccount.getAccountBalance() - amount;
            int dBalance = dAccount.getAccountBalance() + amount;
            accountDAO.updateAccount(wBalance, wAccountNumber);
            accountDAO.updateAccount(dBalance, dAccountNumber);

            // 트랜잭션 이력 남기기 (서비스에서 인서트)
            Transaction transaction = Transaction.builder()
                    .transactionAmount(amount)
                    .transactionWAccountNumber(wAccountNumber)
                    .transactionDAccountNumber(dAccountNumber)
                    .transactionWBalance(wBalance)
                    .transactionDBalance(dBalance)
                    .build();
            transactionDAO.transfer(transaction);
            connection.commit();
            System.out.println("계좌이체 결과: 성공");
            //----------------------------------------------- 트랜잭션 종료
        } catch (Exception e) {
            try {
                connection.rollback();
                System.out.println("[catch] " + e.getMessage());
            } catch (Exception innerEX) {
                innerEX.printStackTrace();
            }
        } finally {
                try {
                    connection.setAutoCommit(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }


    }

