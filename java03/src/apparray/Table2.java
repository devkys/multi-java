package apparray;

import javax.swing.*;

public class Table2 {
    public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(500,500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	String[] header = {"컴퓨터", "영어", "수학", "체육"};

	String[][] contents = {
	    { "100", "33", "34", "78" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" },
	    { "87", "66", "76", "100" }

	};


	JTable table = new JTable(contents, header);

	JScrollPane sc = new JScrollPane(table);

	f.add(table);

	f.setVisible(true);

    }
}