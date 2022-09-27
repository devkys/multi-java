package practice;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Confirm {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tf3;
	private static JTextField tf4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.GREEN);


		JLabel food_lbl = new JLabel("먹고 싶은 음식");
		food_lbl.setBounds(20, 45, 110, 29);
		f.getContentPane().add(food_lbl);
		
		tf1 = new JTextField();
		tf1.setBounds(125, 45, 145, 27);
		tf1.setBackground(Color.ORANGE);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JButton btn1 = new JButton("어디로 갈까?");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = tf1.getText();
				if (s1.equals("커피") || s1.equals("홍차") || s1.equals("아이스 라떼") || s1.equals("아이스 아메리카노")) {
					JOptionPane.showMessageDialog(f, "카페 가세요");
				}
				else {
					JOptionPane.showMessageDialog(f, "물 마시세요");
				}
			}
		});
		btn1.setBounds(30, 86, 227, 34);
		f.getContentPane().add(btn1);
		
		JLabel age_lbl = new JLabel("당신의 나이는?");
		age_lbl.setBounds(20, 162, 110, 29);
		f.getContentPane().add(age_lbl);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(125, 162, 145, 27);
		tf2.setBackground(Color.PINK);
		f.getContentPane().add(tf2);
		
		JButton btn2= new JButton("나의 내년 나이는?");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = tf2.getText();
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, (age+1) + "살");
			}
		});
		btn2.setBounds(30, 203, 227, 34);
		f.getContentPane().add(btn2);
		
		JLabel korean_lbl = new JLabel("국어 점수");
		korean_lbl.setBounds(20, 277, 110, 29);
		f.getContentPane().add(korean_lbl);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(125, 277, 145, 27);
		tf3.setBackground(Color.CYAN);
		f.getContentPane().add(tf3);
		
		JLabel math_lbl = new JLabel("수학 점수");
		math_lbl.setBounds(20, 331, 110, 29);
		f.getContentPane().add(math_lbl);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(125, 331, 145, 27);
		tf4.setBackground(Color.CYAN);
		f.getContentPane().add(tf4);
		
		JButton btn3 = new JButton("두 과목 점수의 평균은?");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = tf3.getText();
				String s4 = tf4.getText();
				int n1 = Integer.parseInt(s3);
				int n2 = Integer.parseInt(s4);
				
				double avg = (n1 + n2) / 2.0;
				JOptionPane.showMessageDialog(f, avg + "점");
			}
		});
		btn3.setBounds(30, 384, 227, 34);
		f.getContentPane().add(btn3);
		f.setVisible(true);
		
		

	}

}
