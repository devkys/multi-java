package apparray;

import java.util.*;

public class Arange {
    public static void main(String[] args) {

	Random r = new Random();

	int num[] = new int[1000];
	int three_cnt = 0;
	int four_cnt = 0;
	int five_cnt = 0;
	int six_cnt = 0;


	for( int i=0; i<num.length; i++ ) {
	    num[i] = r.nextInt(1000);

	    if(num[i] >= 300) {
		three_cnt++;
		if(num[i] >= 400) {
		    four_cnt++;
		    if(num[i] >= 500) {
			five_cnt++;
			if(num[i] >= 600) {
			    six_cnt++;
			}
		    }
		}
	    }
	}


	System.out.println("over 300: " + three_cnt);
	System.out.println("over 400: " + four_cnt);
	System.out.println("over 500: " + five_cnt);
	System.out.println("over 600: " + six_cnt);
	

    }
}




