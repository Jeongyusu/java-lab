package ex03;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Date {
    public static void main(String[] args) {

        int intyear = 0;
        int intmonth = 0;
        int intday = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("날짜를 0000-00-00 형식으로 입력하시오: ");

        String date = sc.nextLine();

        String[] parts = date.split("-");
        String year = parts[0];
        String month = parts[1];
        String day = parts[2];

        System.out.println("연,월,일 중 어떤 것을 변경하시겠습니까? ");
        String input = sc.nextLine();

        if (input == "연") {
            intyear = Integer.parseInt(input);
            System.out.println("변경할 값을 입력해주세요.");
            int interval = sc.nextInt();
            if (interval > 0)
                intyear = intyear + interval;
            else if (interval < 0)
                intmonth = intmonth - interval;
            System.out.println("변경된 연도는 " + intmonth + "입니다.");
        }

    }

}
