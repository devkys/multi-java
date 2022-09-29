package basicarray;
import java.util.Scanner;


public class ArrInput {
    public static void main(String[] args) {
	int[] num = new int[5];
	Scanner in = new Scanner(System.in);

	for(int i = 0 ; i < num.length; i++) {
	    System.out.print("숫자입력 >> ");
	    num[i] =  in.nextInt();
	}

	for(int x: num) {
	    System.out.println(x);
	}
    }
}
