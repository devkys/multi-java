package applyheritance;


import javax.swing.JOptionPane;

public class CounterThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 20; i >= 0; i--) {
			System.out.println("카운트 >>" + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			if(i==0) {
				JOptionPane.showMessageDialog(null, "time out");
			}
		}
	}

}
