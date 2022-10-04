package useclass;

import makeclass.Calcu;

public class Shop {
	public static void main(String[] args) {
		Calcu ca = new Calcu();
		int result = ca.add(200, 100);
		double result2 = ca.add(100, 22.2);
		double result3 = ca.add(11.1, 22.2);
		String result4 = ca.add("안녕", 12);
		int result5 = ca.multi(3000, 4);
		double result6 = ca.div(result2, 4);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
	}
}
