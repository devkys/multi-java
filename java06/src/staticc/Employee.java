package staticc;

public class Employee {
	String name;
	int age;
	String gender;
	static int count;
	static int sum_age;
	
	public Employee(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		sum_age += age;
		count++;
		
	}
	
	public String toString() {
		return name + "의 나이는 " + age + "이고 성별은 " + age + " 입니다.";
	}
	
	public static double getAvg() {
		return sum_age/count;
	}

}
