package crawling;

import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Croll2 {
	public static void main(String[] args) {

		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930\r\n" + "").get();
			// System.out.println(doc);

			// class가 nav인 태그를 다 묶어서 찾아와줘
			// Elements list = doc.select(".code");
			// System.out.println(list.size());

			// System.out.println(list.get(i));
			// Element tag = list.get(0);
			// System.out.println(tag.text());

			Elements list = doc.select(".blind");
			System.out.println(list.size());
//			System.out.println(list);
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(i + ": " + tag);
//			}
			
//			현재가
			Element tag = list.get(16);
			System.out.println(tag.text());
			
		} catch (IOException e) {
		}

	}
}
