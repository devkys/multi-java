package loop;

import java.util.*;

import javax.swing.*;

public class Correct {
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);
		int no = 0;
		int count = 0;
		
		while (true) {

			String data = JOptionPane.showInputDialog("숫자 입력");
			int data2 = Integer.parseInt(data);

			count++;

			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다. ");
				System.out.println("전체 시도횟수는 " + count);
				System.out.println("틀린 횟수는 " + no);
				break;
			} else {
				no++;
				System.out.println("정답이 아닙니다.");
				if (data2 > target) {
					System.out.println("너무 커요");
				} else {
					System.out.println("너무 작아요.");
				}
			}
		}
	}
}
