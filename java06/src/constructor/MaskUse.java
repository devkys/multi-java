package constructor;

import constructor.Mask;

public class MaskUse {
	public static void main(String[] args) {
		Mask m1 = new Mask("white", 3000, 5);
		Mask m2 = new Mask("white", 3000, 5);

		System.out.println(m1);
		System.out.println(m2);
	}
}
