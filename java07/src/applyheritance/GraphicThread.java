package applyheritance;

import java.util.Date;
import java.awt.*;
import javax.swing.*;

public class GraphicThread extends JFrame {
	JLabel count;
	JLabel image;
	JLabel day;
	
	public GraphicThread() {
		getContentPane().setBackground(Color.GREEN);
		setSize(800,300);
		count = new JLabel("카운터");
		image = new JLabel("이미지");
		day = new JLabel("시각");
		
		Font font = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		day.setFont(font);
		image.setFont(font);
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);

		setVisible(true);
		
		CounterThread2 t1 = new CounterThread2();
		t1.start();
		ShowThread2 t2 = new ShowThread2();
		t2.start();
		ImageThread2 t3 = new ImageThread2();
		t3.start();
	}

	public static void main(String[] args) {
		GraphicThread gp = new GraphicThread();
	}

	public class ShowThread2 extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Date date = new Date();
			for (int i = 500; i > 0; i--) {
//				System.out.println("날짜 >>" + date);
				day.setText("시간 >> " + date);
				

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}

	}

	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 20; i >= 0; i--) {
//				System.out.println("카운트 >>" + i);
				count.setText("카운트>> " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(getContentPane(), "time out");
				}
			}
		}

	}

	public class ImageThread2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };

			// TODO Auto-generated method stub
			for (int i = 0; i < list.length; i++) {
//				System.out.println("이미지 >>" + list[i]);
//				image.setText("이미지 >>" + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		}

	}

}
