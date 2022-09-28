package condition;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("컴퓨터과목 점수: ");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();

		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if ( score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}

	}

}
