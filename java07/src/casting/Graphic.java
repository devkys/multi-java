package casting;

import javax.swing.*;
import java.awt.*;

public class Graphic {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("나느 버튼");
		f.add(b);
		
		JLabel l = new JLabel("나는 라벨");
		f.add(l);
		
		JTextField t = new JTextField("나는 텍스트필드");
		f.setVisible(true);
	}

}
