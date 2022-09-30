package useclass;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import useclass.Diary;

public class Login {
	private static JTextField id_tf;
	private static JTextField pw_tf;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.getContentPane().setLayout(null);

		JLabel img_lbl = new JLabel("");
		img_lbl.setIcon(new ImageIcon("C:\\Users\\keong\\multi-java\\java03\\diary.jpg"));
		img_lbl.setBounds(9, 10, 474, 176);
		f.getContentPane().add(img_lbl);

		JLabel id_lbl = new JLabel("아이디");
		id_lbl.setFont(new Font("굴림", Font.BOLD, 30));
		id_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		id_lbl.setBounds(41, 221, 141, 45);
		f.getContentPane().add(id_lbl);

		JLabel pw_lbl = new JLabel("비밀번호");
		pw_lbl.setFont(new Font("굴림", Font.BOLD, 30));
		pw_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		pw_lbl.setBounds(41, 296, 141, 45);
		f.getContentPane().add(pw_lbl);

		id_tf = new JTextField();
		id_tf.setFont(new Font("굴림", Font.PLAIN, 25));
		id_tf.setBounds(240, 221, 212, 45);
		f.getContentPane().add(id_tf);
		id_tf.setColumns(10);

		pw_tf = new JTextField();
		pw_tf.setFont(new Font("굴림", Font.PLAIN, 25));
		pw_tf.setColumns(10);
		pw_tf.setBounds(240, 296, 212, 45);
		f.getContentPane().add(pw_tf);
		
		JButton login_btn = new JButton("");
		login_btn.setIcon(new ImageIcon("C:\\Users\\keong\\multi-java\\java03\\login.png"));
		login_btn.setBounds(72, 367, 110, 74);
		f.getContentPane().add(login_btn);
		login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = id_tf.getText();
				String s2 = pw_tf.getText();

				if (s1.equals("root") && s2.equals("1234")) {
					Diary diary = new Diary();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패입니다.");
				}

			}
		});

		JButton reset_btn = new JButton("");
		reset_btn.setIcon(new ImageIcon("C:\\Users\\keong\\multi-java\\java03\\reset.png"));
		reset_btn.setBounds(304, 367, 110, 74);
		f.getContentPane().add(reset_btn);
		
		reset_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id_tf.setText("");
				pw_tf.setText("");
			}
		});

		f.setVisible(true);

	}
}
