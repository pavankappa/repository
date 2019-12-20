package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
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
		int input = 13;
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
		}
	
		
}