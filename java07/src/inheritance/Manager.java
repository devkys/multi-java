package inheritance;

public class Manager extends Server {

	int bonus;

	public void test() {
		System.out.println("직원 면접을 보는 매니저.");
	}
	
	public String toString() {
		return "이름= " + name + ", 보너스=" + bonus + ", 봉급=" + salary + ", 주소="+address;
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.name="Mingi";
		server.address="Busan";
		server.salary = 100;
		System.out.println(server);
		
		Manager m = new Manager();
		m.name="Jihyeon";
		m.address="Seoul";
		m.salary=200;
		m.bonus = 50;
		System.out.println(m);
		m.test();
		
	}

}
