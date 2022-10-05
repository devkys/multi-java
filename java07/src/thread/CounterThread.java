package thread;

public class CounterThread extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터>>" + i);
		}
	}

}
