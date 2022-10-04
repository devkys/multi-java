package makeclass;


public class Account {

	String name;
	String account;
	int money;

	public void push(){
	    System.out.println(name+"이 " + money + "원을 입금하다.");
	}

	public void out(){
	    System.out.println(name+"이" + account + "에서 출금하다.");
	}
}
