package apparray;

import java.util.*;

public class Confirm {
	public static void main(String[] args) {
		String[] s = new String[3];
		String[] s2 = new String[3];
		Scanner in = new Scanner(System.in);

		System.out.println("작년에 가고 싶었던 곳 3곳을 입력하세요.");
		for (int i = 0; i < s.length; i++) {
			s[i] = in.next();
		}

		System.out.println("올해 가고 싶었던 곳 3곳을 입력하세요.");
		for (int i = 0; i < s2.length; i++) {
			s2[i] = in.next();
		}

		int count = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(s2[i])) {
				count++;
			}
		}

		System.out.println("작년과 올해 가고 싶은 곳이 " + count + "개 동일합니다. ");

	}
}
