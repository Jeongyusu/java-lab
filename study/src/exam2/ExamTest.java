package exam2;

public class ExamTest {
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