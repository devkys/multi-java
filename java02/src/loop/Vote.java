package loop;

import java.util.*;
import javax.swing.*;

public class Vote {
	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int bts = 0;

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("입력 1)아이유, 2)유재석, 3)방탄, 4)종료>>");
			int choice = in.nextInt();

			if (choice == 4) {
				System.out.println("종료합니다.");
				System.out.println("iu 득표수>>" + iu + "표");
				System.out.println("유재석 득표수>>" + you + "표");
				System.out.println("방탄 득표수>>" + bts + "표");
				break;

			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				you++;
			} else if (choice == 3) {
				bts++;
			} else {
				System.out.println("없는 번호입니다.");
			}

		}
	}
}
