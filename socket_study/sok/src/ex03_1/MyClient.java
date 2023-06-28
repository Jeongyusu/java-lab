package ex03_1;

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

        //2. 서버쪽으로 메시지 전송
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        //3. 키보드 버퍼연결 - 키보드 메시지 받아서!
        Scanner sc = new Scanner(System.in);

        while(true) {
            String chatting = sc.nextLine();

            if(chatting.equalsIgnoreCase("quit")){
                System.out.println("서버와의 연결을 종료합니다.");
                break;

            }
            writer.write(chatting); //버퍼는 8192바이트
            writer.write("\n");//
            writer.flush();

            BufferedReader cReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String smsg = cReader.readLine();

            System.out.println("서버의 메시지 : " + smsg);
        }

        writer.close();
        socket.close();

    }

    public static void main(String[] args) {

        try {
            new MyClient();

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
