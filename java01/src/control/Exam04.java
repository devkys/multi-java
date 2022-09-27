package control;
import java.util.Scanner;
import javax.swing.*;

public class Exam04 {
	public static void main(String[] args) {
		System.out.println("1학기 성적");
		Scanner in = new Scanner(System.in);
		int physical = in.nextInt();
		int math = in.nextInt();
		int english = in.nextInt();
		int korean = in.nextInt();
		float sum = 0;
		sum = (physical + math + english + korean)/4;
		JOptionPane.showMessageDialog(null, sum);

	}
}
