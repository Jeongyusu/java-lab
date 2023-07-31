package ex01;

public class Varo03 {
    public static void main(String[] args) {
        //캐스팅
        int n1 = 10;//변수의 선언 및 초기화
    
        double d1 = n1; //묵시적 형변환(or 업 캐스팅) 
        //작은 것을 큰 것에 넣는 것은 아무 문제 없음

        // System.out.println(d1);

        //다운 캐스팅, 명시적 형변환
        double d2 = 10.5 ;
        int n2 = (int)d2;
        // System.out.println(n2);

        //문자 형변환(아스키코드)
        //010101011101->65
        int ch = 65;
        // char data =ch; // char는 2바이트, ch는 4바이트 에러발생


        // char data = (char)ch;
        // System.out.println(ch);



        byte ca = 65;
        // char data = ca; 크기와 상관 없이 형이 달라서 에러 발생
        // 
       
        char data = (char)ca;


    }
    
}
