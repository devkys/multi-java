package condition;

import java.util.Scanner;

public class Pass {
	public static void main(String[] args) {
		System.out.print("암호를 대시오: ");
		Scanner in = new Scanner(System.in);

		String pw = in.next();
		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		in.close();
	}

}
