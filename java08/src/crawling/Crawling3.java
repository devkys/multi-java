package crawling;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling3 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc").get();
			
			Elements list = doc.select(".Nitem_link_menu");
			System.out.println(list.size());
			
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + ": " + tag.text());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
