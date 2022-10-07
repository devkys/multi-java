package crawling;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Naver {
	private static JTextField code_tf;
	public static JTextArea ta;
	public static void main(String[] args) {
		Crawling5 c = new Crawling5();
		
		JFrame f = new JFrame("주식 크롤링");
		f.setSize(400,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JLabel code_lbl = new JLabel("CODE:");
		code_lbl.setForeground(Color.RED);
		code_lbl.setFont(new Font("굴림", Font.BOLD, 37));
		code_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		code_lbl.setBounds(121, 268, 160, 58);
		f.getContentPane().add(code_lbl);
		
		code_tf = new JTextField();
		code_tf.setBackground(Color.GREEN);
		code_tf.setFont(new Font("굴림", Font.PLAIN, 35));
		code_tf.setBounds(43, 324, 304, 49);
		f.getContentPane().add(code_tf);
		code_tf.setColumns(10);
		
		ta = new JTextArea();
		ta.setForeground(Color.BLUE);
		ta.setFont(new Font("Monospaced", Font.BOLD, 22));
		ta.setBounds(43, 430, 304, 196);
		f.getContentPane().add(ta);
		
		JButton btn1 = new JButton("삼성 전자");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crawling5 c = new Crawling5();
				c.craw("005930");
				ta.setText("회사명 : " + c.company_name + "\n전일가 : " + c.yesterday +"\n현재가 : " + c.today
						+"\n시가 : " + c.price);
			}
		});
		btn1.setBackground(Color.ORANGE);
		btn1.setFont(new Font("굴림", Font.BOLD, 41));
		btn1.setBounds(57, 10, 278, 76);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("네이버");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Crawling5 c = new Crawling5();
				String result = (String) c.craw("035420");
				ta.setText(result);
				
			}
		});
		btn2.setBackground(Color.ORANGE);
		btn2.setFont(new Font("굴림", Font.BOLD, 41));
		btn2.setBounds(57, 96, 278, 76);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("카카오");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Crawling5 c = new Crawling5();
				String result = (String)c.craw("035720");
				ta.setText(result);
			}
		});
		btn3.setBackground(Color.ORANGE);
		btn3.setFont(new Font("굴림", Font.BOLD, 41));
		btn3.setBounds(57, 182, 278, 76);
		f.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("크롤링 시작");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = code_tf.getText();
//				Crawling5 c = new Crawling5();
				String result = (String)c.craw(code);
				ta.setText(result);
			}
		});
		
		btn4.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		btn4.setBounds(104, 383, 189, 37);
		f.getContentPane().add(btn4);
		
		f.setVisible(true);
	}
}