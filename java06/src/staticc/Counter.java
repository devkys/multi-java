package staticc;

import  java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Counter {
    static int count;
    static JLabel label;

    public static void main(String[] args) {
	JFrame f = new JFrame("나의 카운터 프로그램");
	f.setSize(350,350);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.getContentPane().setLayout(null);
	
	JButton add_btn = new JButton("1 더하기");
	add_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText(count + "");
			
		}
	});
	
	add_btn.setBackground(Color.GREEN);
	add_btn.setFont(new Font("굴림", Font.BOLD, 13));
	add_btn.setBounds(12, 10, 91, 23);
	f.getContentPane().add(add_btn);
	
	JButton zero_btn = new JButton("0으로 초기화");
	zero_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count=0;
			label.setText("" + count);
		}
	});
	zero_btn.setBackground(Color.BLUE);
	zero_btn.setForeground(Color.WHITE);
	zero_btn.setFont(new Font("굴림", Font.BOLD, 12));
	zero_btn.setBounds(115, 10, 111, 23);
	f.getContentPane().add(zero_btn);
	
	JButton sub_btn = new JButton("1 빼기");
	sub_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			count--;
			label.setText("" + count);
		}
	});
	sub_btn.setBackground(Color.GREEN);
	sub_btn.setFont(new Font("굴림", Font.BOLD, 13));
	sub_btn.setBounds(233, 10, 91, 23);
	f.getContentPane().add(sub_btn);
	
	label = new JLabel("0");
	label.setFont(new Font("궁서", Font.BOLD, 99));
	label.setForeground(Color.RED);
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setBounds(81, 92, 186, 146);
	f.getContentPane().add(label);
    




	f.setVisible(true);

	
    }
}
