package constructor;

public class Computer {
	int price;
	double size;
	String madeby;
	
	public Computer(int price, double size, String madeby) {
	    this.price=price;
	    this.size=size;
	    this.madeby=madeby;
	}
	
	public String toString() {
		return "컴퓨터 [가격=" + price + ", 사이즈=" + size + ", 제조회사=" + madeby + "]";
	}



}
