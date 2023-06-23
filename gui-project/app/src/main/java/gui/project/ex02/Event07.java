package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 1. 이벤트 소스
public class Event07 extends MyFrame implements ActionListener {

    // 생성자 안에 변수선언 X, 바깥에서 사용 못함
    private JButton btn1, btn2;

    public Event07() {
        // 1. 컴포넌트 생성
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2. 컴포넌트를 컨테이너에 배치
        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        // 4. 그림 그리기
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn2 = (JButton) e.getSource();
        if (btn2.getText().equals("버튼1")) {
            //
            System.out.println("버튼1이 클릭되었습니다.");

        } else if (btn2.getText().equals("버튼2")) {
            //
            System.out.println("버튼2가 클릭되었습니다.");
        }

    }

    public static void main(String[] args) {
        new Event07();

    }

}
