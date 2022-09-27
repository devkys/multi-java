package review;

import javax.swing.*;

public class Exam03{
	public static void main(String[] args) {
		String com =  JOptionPane.showInputDialog("통신사");
		String tel =  JOptionPane.showInputDialog("전화번호");
		String name =  JOptionPane.showInputDialog("이름");
		
		String total = name + "님은 " + com + "에 " + tel;

		JOptionPane.showMessageDialog(null, total + "로 가입되었습니다.");

	}
}
