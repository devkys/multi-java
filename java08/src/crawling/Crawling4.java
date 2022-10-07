package crawling;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling4 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			
			Elements list = doc.select("td.first").select(".blind");
//			System.out.println(list);
			//전일가
			Element tag = list.get(0);
			String yesterday = tag.text();
			
			Elements list2 = doc.select("div.today").select(".blind");
//			System.out.println(list2);
			Element tag2 = list2.get(0);
			String today = tag2.text();
			
			Elements list3 = doc.select("td.first").select(".blind");
			Element tag3 = list3.get(1);
			System.out.println(tag3.text());

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
