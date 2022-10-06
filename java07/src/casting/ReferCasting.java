package casting;

import java.util.*;
import javax.swing.*;

public class ReferCasting {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ㅇㅇㅇ");
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size());
		
		// int <---> Integer <---Object
		//Integer, Double, Boolean, character
		//기본형과 관련된 처리를 하기 위해서
		//부픔으로 크게 만들어놨음.
		//기본형 + 포장 => 포장클래스(Wrapper class)
		//기본형과 포장클래스간에는 자동변환이 가능
		//int ---> Integer: boxing, 박싱
		//int <--- Integer: unboxing, 언박싱
		//autoboxing, autounboxing
		//Object로 꺼내면 연산이 되지 않음
		
		String name = (String)list.get(0);
		int age = (int)list.get(1);
		double eye = (double)list.get(2);
		boolean food = (boolean)list.get(3);
		JButton b = (JButton)list.get(4);
		
	}
}
