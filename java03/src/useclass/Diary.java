package useclass;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

public class Diary {
	
	private static JTextField textField;
	private static JTextField textField_1;
	
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
		
		textField = new JTextField();
		textField.setBounds(183, 52, 270, 41);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBackground(Color.GREEN);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 129, 270, 41);
		textField_1.setBackground(Color.GREEN);
		f.getContentPane().add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(183, 215, 270, 149);
		textArea.setBackground(Color.GREEN);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("일기 저장");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		btnNewButton.setBounds(133, 384, 200, 55);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.PINK);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		f.setVisible(true);
		
	}
}
