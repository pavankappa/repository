package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecMostRepChar {

	public static void main(String[] args) {
		String name = "PayPal India";
		
		char[] charArray = name.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char eachChar: charArray) {
			if(map.containsKey(eachChar)) {
				Integer value = map.get(eachChar)+1;
				map.put(eachChar, value);
			}else {
				map.put(eachChar, 1);
			}
		}
		System.out.println(map);
	}

}
