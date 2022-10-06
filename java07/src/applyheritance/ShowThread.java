package applyheritance;

import java.util.Date;

public class ShowThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date date = new Date();
		for (int i = 500; i > 0; i--) {
			System.out.println("날짜 >>" + date);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
