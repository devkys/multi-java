package practice;

import java.util.*;

public class Exam02 { 
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		double height;
		System.out.println("적정 몸무게를 출력합니다.");
		System.out.print("키를 입력하세요 >> ");
		height = in.nextDouble();
		double result = (height - 100) * 0.9;	
		String result2 = String.format("%.2f", result);
		System.out.println("당신의 적정 몸무게는 " + result2 + "입니다.");
		

	}
}
