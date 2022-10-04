package constructor;

import constructor.Computer;

public class Assemble {
	public static void main(String[] args) {
		Computer c1 = new Computer(20000, 23.2, "apple");
		Computer c2 = new Computer(30000, 13.2, "Samsung");
		
		System.out.println(c1);
		System.out.println(c2);

	}
}
