package staticc;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("홍길동", 25, "여");
		Employee e2 = new Employee("김길동", 23, "남");
		Employee e3 = new Employee("송길동", 26, "여");
		
		System.out.println("회사의 총 직원수 " + Employee.count);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("직원들의 평균 나이는 " + Employee.getAvg());
		
		
	}

}
