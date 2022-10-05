package constructor;

public class Mask {
    String color;
    int price;
    int count;

    public Mask(String color, int price, int count) {
	this.color = color;
	this.price = price;
	this.count = count;
    }
    
    public String toString() {
    	return color + "의 " + price + "는"  + count + "값입니다. ";
    }

}
