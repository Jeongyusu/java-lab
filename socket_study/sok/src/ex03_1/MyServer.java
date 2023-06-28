package ex03_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

    //Alt+insert 생성자 만들기
    public MyServer() throws IOException {
        // 1. 서버 소켓(리스너) 생성
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept(); // Socket socket 이 진짜 소켓, = 이하는 리스너가 대기중
        System.out.println("클라이언트가 연결되었습니다.");

        //2. 클라이언트의 메시지를 받기
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        String msg = reader.readLine(); //버퍼 비우기
        System.out.println("받은 메시지 : " + msg);

        //3. 쓰기 버퍼를 달아서 ok라는 메시지 응답하기
//        BufferedWriter serverWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        serverWriter.write("ok"); //버퍼는 8192바이트
//        serverWriter.write("\n");//
//        serverWriter.flush();

        //4. 키보드 입력으로 응답하기
        BufferedWriter serverWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);

        while(true) {

            if(msg.equalsIgnoreCase("quit")) {
                System.out.println("클라이언트가 연결을 종료하였음");
                break;
            }
                String tocmsg = sc.nextLine();
                serverWriter.write(tocmsg);
                serverWriter.write("\n");
                serverWriter.flush();

        }

        serverWriter.close();
        serverSocket.close();
        socket.close();


    }

    public static void main(String[] args) {

        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
