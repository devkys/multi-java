package apparray;
import java.util.Scanner;


public class ArrInput {
    public static void main(String[] args) {
	int[] num = new int[5];
	Scanner in = new Scanner(System.in);

	for(int i = 0 ; i < num.length; i++) {
	    System.out.print("숫자입력 >> ");
	    num[i] =  in.nextInt();
	}

	int sum = 0;

	for(int x: num) {
	    System.out.println(x);
	    sum += x;
	}

	System.out.println();
	System.out.print("합계 :" + sum);
	in.close();

    }
}
