package apparray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reservation {
	static int money = 0;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(700, 700);
		f.setTitle("Movie Reservation");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b1 = new JButton("좌석1");
		JButton b2 = new JButton("좌석2");
		JButton b3 = new JButton("좌석3");

		/*
		 * f.add(b1); f.add(b2); f.add(b3);
		 */
		int[] seat = new int[500];
		

		for (int i = 0; i < 500; i++) {
			JButton b = new JButton("" + (i + 1));
			f.add(b);

			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					JOptionPane.showMessageDialog(f, s + " 번 예약완료");
					b.setEnabled(false);
					b.setBackground(Color.RED);
					b.setForeground(Color.GRAY);
					int index = Integer.parseInt(s);
					seat[index] = 1;
					
					int cnt = 0;
					
					for (int i = 0; i < 500; i++) {
						if (seat[i] == 1) {
							cnt++;
						}
					}
					money += 13000;
					JOptionPane.showMessageDialog(f, "예약된 좌석은" + cnt + "개 ");
					
				}
			});
		}
		JButton paybtn = new JButton("결제하기");
		paybtn.setBackground(Color.YELLOW);
		paybtn.setForeground(Color.GREEN);
		f.add(paybtn);
		
		paybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "결제금액은 " + money + " 입니다.");
			}
		});

		f.setVisible(true);
		
	}

}
