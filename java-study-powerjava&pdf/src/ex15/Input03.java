package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input03 {

    public static void main(String[] args) {
        // 연결(키보드) 1바이트만 읽을 수 있음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 읽기
        try {
            String data = br.readLine();
            System.out.println(data);

            // System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
