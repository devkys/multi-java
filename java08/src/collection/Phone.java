package collection;

import java.util.*;

public class Phone {
    public static void main(String[] args){
	HashMap phone = new HashMap();
	phone.put(1, "엄마");
	phone.put(2, "아빠");
	phone.put(3, "동생");
	phone.put(4, "친구");
	System.out.println(phone);
	System.out.println(phone.get(1));
	
	phone.put(1, "직장동료");
	System.out.println(phone);
	phone.remove(1);
	System.out.println(phone);
	phone.replace(2, "아버지");
	System.out.println(phone.get(2));

    }
}
