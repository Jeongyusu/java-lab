package ex04;

class Account {

    // 입금(입금할 금액, 본래 있던 금액)
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // 메서드를 호출할 라인으로 값 반환

    }

    // 출금(입금할 금액 300, 계좌 잔액 - money)
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;
    }

    // 리턴은 필요없다. 출력만 해보기!!
    // 출력 : 받는사람 잔액 출력
    // 출력 : 보낸사람 잔액 출력
    void transfer(int amount, int receiverMoney, int senderMoney) {

        if (senderMoney >= amount) {
            receiverMoney = amount + receiverMoney;
            senderMoney = senderMoney - amount;
            System.out.println("받는 사람 잔액 : " + receiverMoney);
            System.out.println("보낸 사람 잔액 : " + senderMoney);
        } else
            System.out.println("보낼 금액이 부족합니다.");
    }

}

public class Meth03 {
    public static void main(String[] args) {

        // 홍길동의 잔액
        int hMoney = 1000;
        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금을 2번하고, 출금 한번하기
        Account hAccount = new Account();
        hMoney = hAccount.deposit(100, hMoney);
        System.out.println("남은 금액 : " + hMoney);
        hMoney = hAccount.deposit(500, hMoney);
        System.out.println("남은 금액 : " + hMoney);
        hMoney = hAccount.withdraw(300, hMoney);
        System.out.println("남은 금액 : " + hMoney);

        // 임꺽정이 입금을 1번(100원)하고, 출금을 2번하기(300,500)하기
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("남은 금액 : " + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("남은 금액 : " + iMoney);

        // 이체 (보낼 금액(amount), 받는 사람 잔액(receiverMoney), 보내는 사람 잔액(senderMoney))
        Account eAccount = new Account();
        eAccount.transfer(300, 500, 300);
    }

}
