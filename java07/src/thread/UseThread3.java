package thread;

public class UseThread3 {

	public static void main(String[] args) {
		ArrayThread t1 = new ArrayThread();
		ShowThread t2 = new ShowThread();
		CounterThread t3 = new CounterThread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
