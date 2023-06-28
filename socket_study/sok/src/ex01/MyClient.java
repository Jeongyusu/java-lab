package ex01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClient {


    public MyClient() throws IOException {
        //1. 서버 연결
        //127.0.0.1 은 루프백주소(OS단에서 백) == local host ==192.168.200.155(사설 IP, 공유기 단에서 백, 비효율적)
        Socket socket = new Socket("127.0.0.1", 10000);

        //2. 서버쪽으로 메시지 전송
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("Hello"); //버퍼는 8192바이트
        writer.write("\n");//
        writer.flush();
    }

    public static void main(String[] args) {

        try {
            new MyClient();

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
