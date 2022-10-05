package constructor;
import javax.swing.*;
import java.awt.*;

public class OverRoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f2 = new JFrame("나는 제목");
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b2 = new JButton("나는 버튼 글자");
		
		Font font = new Font("궁서", 1, 50);
		b2.setFont(font);
		
		f2.setSize(300,300);
		f2.add(b2);
		
		f2.setVisible(true);

	}

}
