package week3.assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String name = "PayPal India";
		char[] cArray = name.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for (char eachChar : cArray) {
			if(map.containsKey(eachChar))
			{
				Integer value = map.get(eachChar)+1;
				map.put(eachChar, value);
			}else {
				map.put(eachChar, 1);
			}
			
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
		if(map.containsValue(1)) {
			
		System.out.println(entry.getKey());
		}
	}

}
}
