package apparray;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String[] family = { "아버지", "어머니", "나" };

		int[] age = { 100, 50, 20 };
		double[] height = { 177.7, 132.2, 155.3 };

		// System.out.println(family[2] + " " + age[2] + " " + height[2]);
		for(int i=0; i < family.length; i++) {
		    System.out.println(family[i] + " " + age[i] + " " + height[i]);
		}

	}

}
