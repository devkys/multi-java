package condition;

import java.util.*;

public class Exam01 {
    public static void main(String[] args) {
	Date date = new Date();

	if(date.getHours() < 11) {
	    System.out.println("good morning");
	} else if(date.getHours() < 15) {
	    System.out.println("good afternoon");
	} else if(date.getHours() < 19) {
	    System.out.println("Good evening");
	} else {
	    System.out.print("Good night");
	}

    }
}
