package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class MapClassRoom {
	
	public static void main(String[] args)
	{
		String text="PAVAN";
		char[] arry = text.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : arry) {
			if (map.containsKey(Character) ) {
				System.out.println(map.get(c));
				
			} else {

			}
		}
	}
	

}
