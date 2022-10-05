package inheritance;

public class PersonUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.gender = "man";
		p.name = "clarck";
		System.out.println(p);
		p.sleep();
		p.eat();
		
		Man m = new Man();
		m.gender = "남자";
		m.name = "David";
		m.size = 100;
		
		System.out.println(m);
		
		Superman superman = new Superman();
		superman.gender = "남자";
		superman.name = "Willium";
		superman.size = 200;
		System.err.println(superman);
		superman.fly();
		superman.run();
		superman.eat();
		superman.sleep();
		
		Woman w = new Woman();
		w.gender = "여자";
		w.name = "Kery";
		w.woman_size = 100;
		System.out.println(w);
		w.hit();
		
		WonderWoman ww = new WonderWoman();
		ww.gender = "여자";
		ww.name = "Candy";
		ww.woman_size = 100;
		System.err.println(ww);
		ww.hit();
		ww.sleep();
		ww.eat();
		ww.hit();
		ww.strong();
	
	}

}
