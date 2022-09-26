package practice;
import java.util.*;
import javax.swing.*;

public class Exam03 { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("통신사 입력: ");
		String categori = in.nextLine();
		System.out.print("전화번호 입력: ");
		String phone = in.nextLine();
		System.out.print("가입자이름 입력: ");
		String name = in.nextLine();

		System.out.println(name + "님은 " + categori + "에 " + phone);
		JOptionPane.showMessageDialog(null, name + "님은 " + categori + "에 " + phone + " 으로 가입되셨습니다.");
		
	}
}
