package exam2;

public class RareItem {
    public static void main(String[] args) {

        wear(2400, 2000);
        wear(3800, 1200);

        // 2000 <= hp , 2000 <=mp 이면 -> "아이템 장착완료" 출력

        // hp, mp 둘 중 하나라도 2000 미만이면 -> "아이템을 착용할 수 없습니다" 출력

    }

    public static void wear(int hp, int mp) {
        if (hp >= 2000 && mp >= 2000)
            System.out.println("아이템을 장착완료!");

        else
            System.out.println("아이템을 장착할 수 없습니다.");

    }

}

// 1. 요구사항
// 체력 2300
// 마력 1500
// 안됨

// 체력 2300
// 마력 2000
// 됨

// 순서도 그리기

// 3. 프로그래밍
// int hp = 2300;
// int mp = 2000;
// if 조건문을 사용해서 hp와 mp가 2000이상일 경우 "아이템 장착완료"
// 를 출력하라
// if 조건물을 사용해서 hp와 mp가 하나라도 2000미만일 경우 "아이템을 장착할
// 수 없습니다"
