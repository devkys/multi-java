package collection;

import java.util.*;

public class Mdata {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45)+ 1);
		}
		System.out.println(lotto);
		
	}
}
