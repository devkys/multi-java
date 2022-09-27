package control;

import java.util.Scanner;
import javax.swing.*;

public class Exam05 {
	public static void main(String[] args) {
		System.out.println("원의 면적을 구해주세요.");
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		double result = r * 3.14 * 2.0;
		
		JOptionPane.showMessageDialog(null, result);
	}
}
