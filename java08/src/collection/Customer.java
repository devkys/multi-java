package collection;

import java.util.*;

public class Customer {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		map.remove(2);
		map.replace(3, "김충성");
		
		System.out.println(map);

		
	}
}
