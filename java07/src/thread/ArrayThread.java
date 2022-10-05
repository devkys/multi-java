package thread;

public class ArrayThread extends Thread {
	@Override
	public void run() {
		String[] s = { "coffe", "water", "snack", "noodle", "sweet potato" };
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> " + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
