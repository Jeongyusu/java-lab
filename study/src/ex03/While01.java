package ex03;
//클래스 이름: 파스칼표기법

//메서드 이름 : 카멜표기법

public class While01 {
    public static void main(String[] args) {
        // for -> 끝이 있는 반복문
        // while -> 끝을 모르는 반복문
        // while(조건식){}
        int i = 1;
        while (true) {

            if (i == 101) {
                break;
            }
            System.out.println("Hello World : " + i);
            i++;
        }

    }

}
