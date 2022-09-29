package basicarray;

public class ArrType {
    public static void main(String[] args) {
	String[] tour = {"Jeju", "Busan", "Tokyo", "US"};

	for(String s: tour) {
	    System.out.print(s + " ");
	}
	
	for(int i=0; i <tour.length; i++) {
	    System.out.print(tour[i] + " ");

	}
	System.out.println();

	char [] color = { 'r', 'g', 'b', 'y', 'b' };
	for(char c: color) {
	    System.out.print(c + " ");
	}
	System.out.println();
	for(int i=0; i <color.length; i++) {
	    System.out.print(color[i] + " ");
	}

	double[] height = { 12.3, 23.5, 45.6, 56.7, 67.8 };
	for(double d: height) {
	    System.out.print(d + " ");
	}
	System.out.println();
	
	for(int i=0; i< height.length; i++) {
	    System.out.print(height[i] + " ");
	}

    }
}
