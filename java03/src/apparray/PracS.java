package apparray;

import java.util.Scanner;

public class PracS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("전화번호 입력>>");

		String s = in.next();
		String s2 = s.trim();
		String[] str = s2.split("-");

		if (str[0].equals("011")) {
			System.out.println("SK");
		} else if (str[1].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}

		if (str[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		if (str.length >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		in.close();
	}
}
