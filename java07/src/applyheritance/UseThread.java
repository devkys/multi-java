package applyheritance;

public class UseThread {
	public static void main(String[] args) {
		ShowThread st = new ShowThread();
		ImageThread it = new ImageThread();
		CounterThread ct = new CounterThread();
		

		st.start();
		it.start();
		ct.start();
	}

}
