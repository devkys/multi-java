package crawling;

import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Croll {
	public static void main(String[] args) {

		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
//			System.out.println(doc);
			
			//class가 nav인 태그를 다 묶어서 찾아와줘
			Elements list = doc.select(".nav");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
				
			}
		} catch (IOException e) {
		}

	}
}
