package sequential;

import java.util.Scanner;

public class Console2 {
    public static void main(String[] args){
	System.out.println("나에 대한 정보 ");
	System.out.println(" -------------");
	Scanner in = new Scanner(System.in);
	System.out.print("이름 입력>> ");
	String name = in.next();
	System.out.print("나이 입력>> ");
	String age = in.next();
	System.out.print("취미 입력>> ");
	String hobby = in.next();
	System.out.println(" -------------");
	System.out.println("나의 이름은 " +  name);
	System.out.println("나의 나이는  " +  age);
	System.out.println("나의 취미는  " +  hobby + "입니다!");
	
    }
}
