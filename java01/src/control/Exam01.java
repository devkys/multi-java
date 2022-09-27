package control;

import javax.swing.*;

public class Exam01 {
	public static void main(String[] args) {
		String rightpw = "p";
		String pw = JOptionPane.showInputDialog("input password");
		
		if(rightpw.equals(pw) == true) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!!!");
		}
	}
}
