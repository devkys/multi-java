package crawling;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling5 {
	String yesterday;
	String today;
	String price;
	String company_name;
	public String craw(String code) {

		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			System.out.println("---------------");
			
			Elements name = doc.select(".wrap_company").select("h2").select("a");
			Element nametag = name.get(0);
			company_name = nametag.text();
			System.out.println(nametag.text());
			
			Elements list = doc.select("td.first").select(".blind");
//			    System.out.println(list);
			// 전일가
			Element tag = list.get(0);
			yesterday = tag.text();
			System.out.println("전일가 : " + yesterday);

//				현재가
			Elements list2 = doc.select("div.today").select(".blind");
//			System.out.println(list2);
			Element tag2 = list2.get(0);
			today = tag2.text();
			System.out.println("현재가 : " + today);

			Elements list3 = doc.select("td.first").select(".blind");
			Element tag3 = list3.get(1);
			price = tag3.text();
			System.out.println("시가 : " + price);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("유효한 값을 입력하세요.");
			
			JOptionPane.showMessageDialog(null, "유효한 값을 입력하세요.");
		}
		
		return "회사명 : " + company_name + "\n전일가 : " + yesterday +"\n현재가 : " + today
				+"\n시가 : " + price;

	}

}
