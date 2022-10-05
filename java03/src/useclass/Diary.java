package useclass;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Diary {
	
	public static JTextField date_tf;
	public static JTextField title_tf;
	public static JTextArea ta;
	
	public void open() {
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.YELLOW);
		
		JLabel lblNewLabel = new JLabel("오늘 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 40, 148, 55);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(23, 117, 148, 55);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘 내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(23, 195, 148, 55);
		f.getContentPane().add(lblNewLabel_2);
		
		date_tf = new JTextField();
		date_tf.setFont(new Font("굴림", Font.BOLD, 30));
		date_tf.setBounds(183, 52, 270, 41);
		f.getContentPane().add(date_tf);
		date_tf.setColumns(10);
		date_tf.setBackground(Color.GREEN);
		
		title_tf = new JTextField();
		title_tf.setFont(new Font("굴림", Font.BOLD, 30));
		title_tf.setColumns(10);
		title_tf.setBounds(183, 129, 270, 41);
		title_tf.setBackground(Color.GREEN);
		f.getContentPane().add(title_tf);
		
		ta = new JTextArea();
		ta.setFont(new Font("굴림", Font.BOLD, 30));
		ta.setBounds(183, 215, 270, 149);
		ta.setBackground(Color.GREEN);
		f.getContentPane().add(ta);
		
		JButton write_btn = new JButton("일기 저장");
		write_btn.setFont(new Font("굴림", Font.BOLD, 35));
		write_btn.setBounds(133, 384, 200, 55);
		write_btn.setOpaque(true);
		write_btn.setBackground(Color.PINK);
		f.getContentPane().add(write_btn);
		
		write_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Write write = new Write();
				write.open();
				
			}
		});
		
		
		
		f.setVisible(true);
		
	}
}
