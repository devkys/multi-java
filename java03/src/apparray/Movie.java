package apparray;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Movie {
	static int start = 0;
	
	public static void main(String[] args) {
		JButton btnNewButton = new JButton("<<");
		JButton btnNewButton_1 = new JButton(">>");	
		
		// TODO Auto-generated method stub
		//영화제목
		String[] title = {"삼진그룹영어토익반", "담보", "위플래시", "라라랜드", "소리도 없이"};
		//포스터 파일(파일 이름)
		String[] img = {"samgin.jpg", "dambo.jpg", "whiplash.jpg", "lala.jpg", "sori.jpg"};
		//평점
		double[] jumsu = {99.8, 88.9, 77.9, 66.9, 55.9};

		JFrame f = new JFrame();
		f.setTitle("Movie");
		f.setSize(750,700);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel top = new JLabel("삼진그룹영어토익반");
		top.setOpaque(true);
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setIcon(new ImageIcon("C:\\Users\\keong\\multi-java\\java03\\samgin.jpg"));
		f.getContentPane().add(center, BorderLayout.CENTER);
		f.setVisible(true);
		
		JLabel under = new JLabel("99.8");
		under.setOpaque(true);
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
			
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setOpaque(true);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start--;
				if(start == -1) {
					btnNewButton.setEnabled(false);
				}
				else {
					btnNewButton_1.setEnabled(true);
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					center.setIcon( new ImageIcon(img[start]));
				}
				
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++;
				if(start == 5) {
					btnNewButton_1.setEnabled(false);
				}
				else {
					btnNewButton.setEnabled(true);
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					center.setIcon( new ImageIcon(img[start]));
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
	}
}