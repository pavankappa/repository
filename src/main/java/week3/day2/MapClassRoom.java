package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapClassRoom {
	
	public static void main(String[] args)
	{
		// Create a String with your name as value
		String text="PAVAN";
		// Convert the string into array
		char[] arry = text.toCharArray();
		// Create an empty map<Character,Integer>
		Map<Character, Integer> map = new HashMap<>();
		// Iterate over the array
		for (char eachChar : arry) {
			//if(map.contains(Character))
			if (map.containsKey(eachChar)) {
				// get the value using key +1
				Integer value = map.get(eachChar)+1;
				map.put(eachChar, value);
				
			} else {
				// add the character in the map & set the value as 1
				map.put(eachChar, 1);
			}
		}
		System.out.println(map);
	}
	

}
