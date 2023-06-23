package gui.project.ex02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event01 extends JFrame {

    private JButton button;
    private JButton button2;
    private JLabel label;
    int counter = 0;

    public Event01() {

        setSize(600, 200);
        setLayout(new FlowLayout());
        setLayout(new FlowLayout());

        button = new JButton("증가");
        button2 = new JButton("2 증가");
        label = new JLabel("현재의 카운터 값" + counter);
        // 클래스가 아니라 메서드를 주입해야하는데, 언어 특성상 클래스 주입
        // 해당 객체에 액션리스너(이벤트 핸들러)를 등록한다.
        button.addActionListener(new Inner()); // 클래스 자리에 원래 메서드가 들어가야함.
        button2.addActionListener(new Inner2());

        add(button);
        add(label);
        add(button2);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // 클래스 안의 클래스, 이 클래스에서만 사용할 때
    class Inner implements ActionListener {

        // 콜백 메서드
        @Override
        public void actionPerformed(ActionEvent e) {
            // e.getSource() -> 이벤트가 발생한 객체를 반환(Source)
            // 이때 Source는 object 타입이므로 JButton으로 강제 형변환 시킴.
            JButton btn = (JButton) e.getSource();
            System.out.println("버튼 클릭됨 : " + e);
            System.out.println(btn.getText());

            counter++;
            System.out.println(counter);

            label.setText("현재의 카운터 값 : " + counter);

        }

    }

    class Inner2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn2 = (JButton) e.getSource();
            System.out.println("버튼 클릭됨 : ");
            System.out.println(btn2.getText());

            counter = counter + 2;
            System.out.println(counter);
            label.setText("현재의 카운터 값 : " + counter);

        }

    }

    public static void main(String[] args) {
        new Event01();

    }

}
