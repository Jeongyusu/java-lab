package ex02;
import java.util.*;

public class Orange {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            
        
            System.out.println("오렌지의 개수를 입력하시오: ");
           
            int input = sc.nextInt();
            int box = input / 10 ;
            int nam = input % 10 ;

            System.out.println(box + "개가 필요하고 " + nam + "개가 남습니다.");
        }
}
