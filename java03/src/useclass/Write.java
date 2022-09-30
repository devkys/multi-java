package useclass;

import java.io.File;

public class Write {

	public static void main(String[] args) {
		String pwd = "c:/Users/keong/multi-java/java03/src/";
		// TODO Auto-generated method stub
		File file = new File(pwd+"useclass/Diary.java");
		boolean ex = file.exists();
		System.out.println("존재 여부: " + ex);
	}

}
