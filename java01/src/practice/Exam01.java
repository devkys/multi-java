package practice;

import java.util.*;

public class Exam01{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width, height;
		System.out.print("가로 입력 >> ");
		
		width = in.nextInt();
		System.out.print("세로 입력 >> ");
		height = in.nextInt();
		System.out.println("사각형의 면적은" + width*height);
		
	}
}
