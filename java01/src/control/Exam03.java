package control;

import javax.swing.*;

public class Exam03 {
	public static void main(String[] args) {
		String rightpw = "p";
		String pw = JOptionPane.showInputDialog("input password");
		String weight = JOptionPane.showInputDialog("몸무게 변화 체크");
		double weight2 = Double.parseDouble(weight);
		if((pw.equals(rightpw) == true) && (weight2 > 2)) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전!");
		}

	}
}		
		
		
		
		
