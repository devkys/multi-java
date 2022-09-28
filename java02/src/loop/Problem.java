package loop;

import java.util.*;

public class Problem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		int n1_count = 0;
		int n2_count = 0;
		
		while (true) {
			System.out.print("숫자 입력 1 >>");
			n1 = in.nextInt();

			System.out.print("숫자 입력 2 >>");
			n2 = in.nextInt();

			if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				n1_count++;
			} else {
				System.out.println("뒷 숫자가 더 크거나 같습니다.");
				n2_count++;
			}
			System.out.println("종료할까요?(x) 계속할까요?(o)");
			String answer = in.next();
			if (answer.equals("x")) {
				System.out.println("게임을 종료합니다.");
				System.out.println("---------------------------------");
				System.out.println("앞 숫자가 더 큰 횟수 " + n1_count);
				System.out.println("뒷 숫자가 더 큰 횟수 " + n2_count);
				System.exit(0);
			} else {
				continue;
			}
		}
	}
}
