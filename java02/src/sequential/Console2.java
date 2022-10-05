package sequential;

import java.util.Scanner;

public class Console2 {
    public static void main(String[] args){
	System.out.println("���� ���� ���� ");
	System.out.println(" -------------");
	Scanner in = new Scanner(System.in);
	System.out.print("�̸� �Է�>> ");
	String name = in.next();
	System.out.print("���� �Է�>> ");
	String age = in.next();
	System.out.print("��� �Է�>> ");
	String hobby = in.next();
	System.out.println(" -------------");
	System.out.println("���� �̸��� " +  name);
	System.out.println("���� ���̴�  " +  age);
	System.out.println("���� ��̴�  " +  hobby + "�Դϴ�!");
	in.close();
    }
}
