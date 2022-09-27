package practice;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class SecondWindow {
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.ORANGE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/kyeongseo/eclipse-workspace/java-project/cal.png"));
		btnNewButton.setBounds(6, 20, 488, 218);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setBounds(58, 296, 61, 16);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setBounds(58, 378, 61, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(204, 291, 130, 26);
		t1.setBackground(Color.YELLOW);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(204, 368, 130, 26);
		t2.setBackground(Color.YELLOW);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton addbtn = new JButton("더하기");
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				f.setTitle("result " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.BLUE);
				t2.setBackground(Color.RED);
				
//				JOptionPane.showMessageDialog(addbtn, n11 + n22);
			}
		});
		addbtn.setBounds(58, 424, 117, 29);
		f.getContentPane().add(addbtn);
		
		JButton subbtn = new JButton("빼기");
		subbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n1 = t1.getText();
				String n2 = t2.getText();
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				f.setTitle("result " + (n11 - n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.BLACK);
				t2.setBackground(Color.GREEN);
				
//				JOptionPane.showMessageDialog(subbtn, n11 - n22);
			}
		});
		subbtn.setBounds(296, 424, 117, 29);
		f.getContentPane().add(subbtn);
		f.setVisible(true);
	}
}
