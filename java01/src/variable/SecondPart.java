package variable;

import javax.swing.*;

public class SecondPart{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("input your name");
		String age = JOptionPane.showInputDialog("input your age");
		String friend = JOptionPane.showInputDialog("input your friend");

		System.out.println("Your name is " +  name);
		System.out.println("Your age is " +  age);
		System.out.println("Your friend is " +  friend);

		JOptionPane.showMessageDialog(null, "Your name is " +  name);
		JOptionPane.showMessageDialog(null, "Your age is " +  age);
		JOptionPane.showMessageDialog(null, "Your friend is " +  friend);
	}
}
