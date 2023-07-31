package ex02;
import java.util.*;


public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        double b;

        
      

        
        System.out.print("번호를 선택하시오:");
        
        a= sc.nextInt();

        System.out.print((a == 1)? "화씨온도를 입력하시오:  " : "섭씨온도를 입력하시오:  ");
        
        b = sc.nextDouble();

        System.out.println((a == 1)? "섭씨온도는 " + ((double)5 / 9) * ( b - 32) + "입니다." : "화씨온도는 " + (b * (9.0 /5.0) + 32)  + "입니다." );

      
        
    }
}
