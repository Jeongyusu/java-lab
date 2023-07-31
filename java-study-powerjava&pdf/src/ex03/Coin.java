package ex03;

public class Coin {

    void printRestMoney() {
    }

    public static void main(String[] args) {

        // 500, 100, 50, 10 (개수를 최소로 해서 주세요.)
        final int money = 2680; // scanner로 수정하기
        int restMoney = money;// 남은 금액 변수 만들기

        int count; // 동전 개수를 담을 변수
        int tempMoney;

        int[] tempMo = { 500, 100, 50, 10 };

        for (int i = 0; i < 4; i++) {

            tempMoney = tempMo[i];
            count = restMoney / tempMoney;
            System.out.println(tempMoney + "원 : " + count);
            restMoney = restMoney % tempMoney;

            /// printRestMoney(){} 사용하려면 new연산자 사용하여 객체생성 해야함.

        }

    }
}
