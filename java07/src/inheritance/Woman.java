package inheritance;

public class Woman extends Person{
	int woman_size;
	
	public void hit() {
		System.out.println("때리다.");
	}
	
	public String toString() {
		return "woman [hit =" + woman_size + ", gender=" + gender + ", name=" + name + "]";  
	}


}
