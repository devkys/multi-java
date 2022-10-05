package inheritance;

public class Person extends Object {
	String gender;
	String name;
	
	public void sleep() {
		System.out.println("잠자다.");
	}
	public void eat() {
		System.out.println("먹다.");
	}
	
	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + "]";  
	}

}
