package day1.classroom;

import java.lang.invoke.SwitchPoint;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int a=2;
		int b=3;
		int c=0;
		
		// Declare a String variable with input as operations (Tip:
		String operations="add";
		
		// Initiate switch case for operations
		switch (operations) {
		case "add":
			c=a+b;
			System.out.println(c);
			break;
		case "sub":
			c=a-b;
			System.out.println(c);
		case "mul":
			c=a*b;
			System.out.println(c);
		case "div":
			c=a/b;
			System.out.println(c);
			
		

		default:
			break;
		}
		
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
