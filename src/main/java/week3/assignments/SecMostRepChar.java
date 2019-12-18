package week3.assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

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
		//System.out.println(map);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		Set<Integer> count = new TreeSet<>();
		
		for (Entry<Character, Integer> eachEntry : entrySet) {
			Integer value = eachEntry.getValue();
			count.add(value);
		}
		System.out.println(count);
		List<Integer> listCout = new ArrayList<>(count);
		
		for(Entry<Character, Integer> enty = entrySet)
		{
			//if(entry.getValue() = Listcount
		}
	}

}
