package applyheritance;

import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class ThreadUse extends JFrame {
	JLabel count1, count2;

	public ThreadUse() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(800, 300);
		count1 = new JLabel("카운터1");
		count2 = new JLabel("카운터2");

		Font font = new Font("굴림", Font.BOLD, 30);
		count1.setFont(font);
		count2.setFont(font);
		add(count1, BorderLayout.WEST);
		add(count2, BorderLayout.EAST);

		setVisible(true);

		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();

	}

	public static void main(String[] args) {
		ThreadUse main = new ThreadUse();
	}

	public class Thread1 extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 20; i >= 0; i--) {
//				System.out.println("카운트1>> " + i);
				count1.setText("카운트1>> " + i + "");

				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "time out");
				}
			}
		}
	}

	public class Thread2 extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 40; i >= 0; i--) {
//				System.out.println("카운트2>> " + i);
				count2.setText("카운트2>> " + i + "");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		}

	}

}
