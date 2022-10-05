package condition;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신이 먹고 싶은 점심 메뉴는(짜장면, 라면, 회)");

		Scanner in = new Scanner(System.in);
		String food = in.next();

		if (food.equals("짜장면")) {
			System.out.println("중국집으로 가요");
		} else if(food.equals("라면")) {
			System.out.println("분식집으로 가요");
		}else if(food.equals("회")) {
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
		in.close();
	}

}
