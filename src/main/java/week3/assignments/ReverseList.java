package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<String> company = new ArrayList<>();
		company.add("HCL");
		company.add("Aspire Systems");
		company.add("CTS");
		
		// To sort a list
		Collections.sort(company);
		
		//To reverse a List, but has to be used after sort
		Collections.reverse(company);
		
		for (String  comp: company) {
			System.out.println(comp);
			
		}
	}

}
