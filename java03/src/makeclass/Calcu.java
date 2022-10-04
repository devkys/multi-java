package makeclass;

public class Calcu {
	public int add(int x, int y) {
		return x + y;
	}

	public double add(int x, double y) {
		return x + y;
	}

	public double add(double x, double y) {
		return x + y;
	}

	public String add(String x, int y) {
		return x + y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	public double div(double x, int y) {
		return x/y;
	}
	public int[] add() {
		int[] x = {1,2,3};
		return x;
	}

}
