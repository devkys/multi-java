package operator;
import javax.swing.*;

public class Exam03 {
	public static void main(String[] args) {
		String id = "root";
		String pw = "pass";

		String id2 = JOptionPane.showInputDialog("로그인 id");
		String pw2 = JOptionPane.showInputDialog("로그인 pw");

		if(id.equals(id2) && pw.equals(pw2)) {
			System.out.println("login success");
		} else {
			System.out.println("logi falied");
		}
	}
}
