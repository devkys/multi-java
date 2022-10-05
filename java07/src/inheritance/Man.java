package inheritance;

public class Man extends Person	{
	
	int size;
	
	public void run() {
		System.out.println("빨리 달리다.");
	}
	
	public String toString() {
		return "맨 [size =" + size + ", gender=" + gender + ", name=" + name + "]";  
	}

}
