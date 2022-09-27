package practice;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class MyWindow {
	private static JTextField txtHello;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		txtHello = new JTextField();
		f.getContentPane().add(txtHello, BorderLayout.SOUTH);
		txtHello.setColumns(10);
		
		JTextArea txtrHi = new JTextArea();
		txtrHi.setText("hi");
		f.getContentPane().add(txtrHi, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/kyeongseo/eclipse-workspace/java-project/bobby.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		f.setVisible(true);

	}

}
