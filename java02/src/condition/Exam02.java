package condition;

import java.util.*;

public class Exam02 {
    public static void main(String[] args) {
	Date date = new Date();
	int month = date.getMonth();
	month  = 2;
	switch(month) {
	    case 2:
		System.out.println("until 28day");
		break;
	    case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.println("until 31day");
		break;
	    default:
		System.out.println("until 30day");
		break;
	}
    }
}
