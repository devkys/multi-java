package apparray;

import java.util.*;

public class Toeic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] paper = new int[990];
		int[] answer = new int[990];

		Random r = new Random();

		for (int i = 0; i < answer.length; i++) {
			paper[i] = r.nextInt(4) + 1;
			answer[i] = r.nextInt(4) + 1;
		}
		
		System.out.println("번호:\t답안\t내답 ");
		System.out.println("-------------------------");
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(i + 1 + ":\t " + paper[i] + "\t" + answer[i]);
		}
		
		int jumsu = 0;
		for(int i=0; i<answer.length; i++) {
			if(paper[i] == answer[i]) {
				jumsu++;
			}
		}
		
		System.out.println("my score: " + jumsu);

	}

}
