package test.lom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 오늘 머먹지 프로그램 제작
// 메뉴를 화면에 출력
// 메뉴1.
// 메뉴2.
// .......
// 8.추천메뉴(배민 땡겨요 기능)
// 만약에 1번을 누르면 1번 메뉴 출력
// 만약 2번 누르면 2번 메뉴 출력
// 8번 누르면 AI가 추천한 메뉴 출력
// 다른 키를 누르면 잘못 눌럿다고 혼냄

public class Launch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rdindex = new Random();
        ArrayList<String> list = new ArrayList<>(List.of("국밥", "칼국수", "돈까스", "김밥", "국수", "서브웨이"));

        System.out.println("오늘 뭐 먹지?");
        for (int i = 0; i < list.size(); i++)
            System.out.println(i + 1 + "." + list.get(i));

        int rnum = rdindex.nextInt(list.size());
        System.out.println("추천 메뉴 : " + list.get(rnum));

        while (true) {
            System.out.println("메뉴 번호를 입력하면 해당 메뉴가 출력됩니다. 메뉴 추천은 8번을 입력해주세요.");

            int x = sc.nextInt();

            try {
                if (x == 8)
                    System.out.println("추천 메뉴는 " + list.get(rnum) + "입니다.");
                else
                    System.out.println("선택하신 메뉴는 " + list.get(x - 1) + "입니다.");
                break;

            } catch (Exception e) {
                System.out.println("잘못된 번호입니다.");
            }
        }

    }

}
