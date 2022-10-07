package crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling6 {
	public static void main(String[] args) {
		String yesterday;
		String today;
		String price;
		String code = "009540";

		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			System.out.println("---------------");
			
			Elements name = doc.select(".wrap_company").select("h2").select("a");
			Element nametag = name.get(0);
			System.out.println(nametag.text());
			
			
//			Elements list = doc.select("td.first").select(".blind");
////			    System.out.println(list);
//			// 전일가
//			Element tag = list.get(0);
//			yesterday = tag.text();
//			System.out.println("전일가 : " + yesterday);
//
////				현재가
//			Elements list2 = doc.select("div.today").select(".blind");
////			System.out.println(list2);
//			Element tag2 = list2.get(0);
//			today = tag2.text();
//			System.out.println("현재가 : " + today);
//
//			Elements list3 = doc.select("td.first").select(".blind");
//			Element tag3 = list3.get(1);
//			price = tag3.text();
//			System.out.println("시가 : " + price);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
