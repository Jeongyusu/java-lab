package gui.project.practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest3 extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;
    int counter = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터값:  " + counter);

    }

    public EventTest3() {
        setSize(400, 150);
        setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값: " + counter);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        EventTest3 t = new EventTest3();

    }
}
