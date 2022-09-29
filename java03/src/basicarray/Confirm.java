package basicarray;

public class Confirm { 
    public static void main(String[] args) {
	int[] n1 = new int[5];
	System.out.println("n1의 크기: " + n1.length);

	n1[0] = 100;
	System.out.println("n1[0] : " +  n1[0]);

	n1[4] = 500;
	System.out.println("n1[4] : " +  n1[4]);

	n1[2] = 200;
	System.out.println("n1[2] : " +  n1[2]);


	for( int x: n1) {
	    System.out.println(x);

	}
	for (int i = 0; i < n1.length; i++) {
	    System.out.println(i + ": " + n1[i]);
	}
    }
}
