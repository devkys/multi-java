package condition;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("숫자1 입력>> ");
	int n1 = in.nextInt();

	System.out.print("숫자2 입력>> ");
	int n2 = in.nextInt();
	
	if(n1 > n2) {
	    System.out.println("숫자1이 더 큼");
	} else {
	    System.out.println("숫자가 같거나 숫자 2가 더큼 ");
	}
    }
}
