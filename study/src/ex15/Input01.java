package ex15;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
    public static void main(String[] args) {
        // 연결(키보드) 1바이트만 읽을 수 있음
        InputStream in = System.in;

        // 읽기 컴파일 익셉션
        try {
            int data = in.read(); // 대기(리스너가 대기하면서 확인)
            System.out.println(data);
            // System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
