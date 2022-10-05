package sequential;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է�: ");
		String name = sc.next();
		System.out.println("�Է¹��� �̸��� " + name + " �Դϴ�. ");

		System.out.print("�Ҽ��� �Է�: ");
		String com = sc.next();
		System.out.println("�Է¹��� �Ҽ��� " + com + "�Դϴ�.");

		sc.close();
	}
}