package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output01 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕");
            bw.write("안녕");
            // bw.write("안녕\n"); 통신할 때는 끝에 \n 필요
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
