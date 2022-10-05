package useclass;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Write {

	public void open() {
		String pwd = "c:/Users/keong/";
		Diary diary = new Diary();
		// TODO Auto-generated method stub
		try {
			FileWriter file = new FileWriter(pwd + "new.txt");
//			File file = new File(pwd+"useclass/new.txt");
			
			file.write(diary.date_tf.getText()+"\n");
			file.write(diary.title_tf.getText()+"\n");
			file.write(diary.ta.getText());
//			boolean ex = file.exists();
//			System.out.println("존재 여부: " + ex);
			
			JOptionPane.showMessageDialog(null, "파일이 성공적으로 저장되었습니다.");
			file.close();

		} catch (IOException e) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러 정보는 " + e.getMessage());
		}
	}

};