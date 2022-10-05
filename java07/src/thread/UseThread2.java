package thread;

public class UseThread2 {
public static void main(String[] args) {
	DollarThread dt = new DollarThread();
	AtThread at = new AtThread();
	AmThread am = new AmThread();
	
	dt.start();
	at.start();
	am.start();
}
}
