package ex03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 클라이언트는 read 버퍼를 만들고
 * 서버는 write 버퍼를 추가로 만든다.
 * Read버퍼로 읽어서 모니터 출력
 */

public class MyClient {


    public MyClient() throws IOException {
        //1. 서버 연결
        //127.0.0.1 은 루프백주소(OS단에서 백) == local host ==192.168.200.155(사설 IP, 공유기 단에서 백, 비효율적)
        Socket socket = new Socket("127.0.0.1", 10000);

        //2. 클라이언트의 요청
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));


        //3. 키보드 버퍼연결 - 키보드 메시지 받아서!
        //BufferedReader reader = new BufferdReader(new InputStreamReader(System.in));
        //String requestMsg = rader.readLine();
        writer.write("text/html"); //버퍼는 8192바이트
        writer.write("\n");//
        writer.flush();

        // 3. 클라이언트가 서버의 응답 받음.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
        String smsg = cReader.readLine();
        System.out.println("서버의 메시지 : " + smsg);
    }

    public static void main(String[] args) {

        try {
            new MyClient();

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
