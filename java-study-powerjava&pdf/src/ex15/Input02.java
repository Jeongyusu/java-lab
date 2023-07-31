package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input02 {

    public static void main(String[] args) {
        // 연결(키보드) 1바이트만 읽을 수 있음
        InputStreamReader ir = new InputStreamReader(System.in);

        // 읽기
        try {
            char[] ch = new char[5]; // 크기를 정해놓고 a받음
            ir.read();
            for (char c : ch) {
                System.out.println(c);
            }

            // System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
