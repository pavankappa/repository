package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
//				int input = 13;
				// Declare a boolean input as flag
				boolean flag=false;
				// Iterate from 1 to half of the input
				for (int i = 0; i < input/2; i++) {
				
					// Divide the input with each for loop variable and check the remainder
					int rem=input%2;
						// Set the flag as true when there is no remainder
						if (rem==0) {
							flag=true;
						// break the iterator
							break;
						}
				}		
				
						// Check the flag (Provide a condition)
						if(flag==false) {
							System.out.println("prime number");
						}else {
							System.out.println("not a prime number");
						}
					// Print 'Prime' when the condition matches
					
					// Print 'Not a Prime' when the condition doesn't match 			
	}

}
