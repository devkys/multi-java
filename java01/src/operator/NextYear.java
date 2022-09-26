package operator;

import javax.swing.*;

public class NextYear {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("올해 나이 입력");
		int age2 = Integer.parseInt(age);

		JOptionPane.showMessageDialog(null, "내년 나이는 " + (age2 + 1));
		
	}
}
