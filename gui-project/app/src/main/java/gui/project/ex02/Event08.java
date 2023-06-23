package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 1. 이벤트 소스
public class Event08 extends MyFrame {

    // 생성자 안에 변수선언 X, 바깥에서 사용 못함
    private JButton btn1, btn2;

    public Event08() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        setVisible(true);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼1이 클릭되었습니다");

            }

        });
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼2가 클릭되었습니다");

            }

        });

    }

    public static void main(String[] args) {
        new Event08();

    }

}
