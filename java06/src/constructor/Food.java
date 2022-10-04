package constructor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Food {
	
	static int count;
	static final int PRICE = 5000;
	static int redcount = 0;
	static int blackcount = 0;
	static int whitecount = 0;
	
	private static JTextField cnt_tf;

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.setSize(800,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.GREEN);
		
		JLabel cnt_lbl = new JLabel("개수: ");
		cnt_lbl.setFont(new Font("굴림", Font.PLAIN, 30));
		cnt_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		cnt_lbl.setBounds(514, 40, 113, 43);
		f.getContentPane().add(cnt_lbl);
		
		cnt_tf = new JTextField();
		cnt_tf.setFont(new Font("굴림", Font.BOLD, 30));
		cnt_tf.setBackground(Color.YELLOW);
		cnt_tf.setBounds(610, 40, 164, 43);
		f.getContentPane().add(cnt_tf);
		cnt_tf.setColumns(10);
		
		JLabel icon_lbl = new JLabel("");
//		icon_lbl.setIcon(new ImageIcon("C:\\Users\\keong\\multi-java\\java06\\jjajang.jpg"));
		icon_lbl.setBounds(133, 121, 503, 223);
		f.getContentPane().add(icon_lbl);
		
		JLabel total_lbl = new JLabel("결제 금액");
		total_lbl.setForeground(Color.RED);
		total_lbl.setFont(new Font("굴림", Font.BOLD, 30));
		total_lbl.setBounds(88, 374, 354, 57);
		f.getContentPane().add(total_lbl);
		
		JButton btn1 = new JButton("짬뽕");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icon_lbl.setIcon(new ImageIcon("C:\\\\Users\\\\keong\\\\multi-java\\\\java06\\\\jjambong.jpg"));
				redcount++;
				cnt_tf.setText(redcount + "개");
				count += (redcount * PRICE);
				total_lbl.setText("결제금액: " + count);
				f.setTitle("짬뽕개수: " + redcount + "우동개수: " + whitecount + "짜장면개수: " + blackcount);
			}
		});
		btn1.setBackground(Color.MAGENTA);
		btn1.setFont(new Font("굴림", Font.BOLD, 30));
		btn1.setBounds(29, 26, 138, 68);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("우동");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icon_lbl.setIcon(new ImageIcon("C:\\\\Users\\\\keong\\\\multi-java\\\\java06\\\\udong.jpg"));
				whitecount++;
				cnt_tf.setText(whitecount + "개");
				count += (whitecount * PRICE);
				total_lbl.setText("결제금액: " + count);
				f.setTitle("짬뽕개수: " + redcount + "우동개수: " + whitecount + "짜장면개수: " + blackcount);
			}
		});
		btn2.setBackground(Color.ORANGE);
		btn2.setFont(new Font("굴림", Font.BOLD, 30));
		btn2.setBounds(179, 26, 138, 68);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("짜장");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				icon_lbl.setIcon(new ImageIcon("C:\\\\Users\\\\keong\\\\multi-java\\\\java06\\\\jjajang.jpg"));
				blackcount++;
				cnt_tf.setText(blackcount + "개");
				count += (blackcount * PRICE);
				total_lbl.setText("결제금액: " + count);
				f.setTitle("짬뽕개수: " + redcount + "우동개수: " + whitecount + "짜장면개수: " + blackcount);
			}
		});
		btn3.setBackground(Color.CYAN);
		btn3.setFont(new Font("굴림", Font.BOLD, 30));
		btn3.setBounds(329, 26, 138, 68);
		f.getContentPane().add(btn3);
		f.setVisible(true);
		
	}
}
