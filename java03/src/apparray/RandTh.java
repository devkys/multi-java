package apparray;

import java.util.*;

public class RandTh {
    public static void main(String[] args) {

	int [] lotto = new int[1000];

	Random r = new Random();

	for (int i=0; i < lotto.length; i++) {
	    lotto[i] = r.nextInt(1000);
	}
	for( int i=0; i < lotto.length; i++ ) {
	    System.out.println(lotto[i]);
	}
    }
}
