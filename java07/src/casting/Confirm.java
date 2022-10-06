package casting;

import java.util.ArrayList;

public class Confirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add("남");
		
		int money = (int)me.get(0);
		double height = (double)me.get(1);
		boolean food = (boolean)me.get(2);
		String gender = (String)me.get(3);
		
		System.out.println("2000원을 더한 돈은: " + money+2000);
		System.out.println("10을 더한 키: " + height+10);
		if(food == true) {
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요.");
		}
		if(gender.equals("남")) {
			System.out.println("주민번호는 1,3");
		} else {
			System.out.println("주민번호는 2,4");
		}
	}

}
