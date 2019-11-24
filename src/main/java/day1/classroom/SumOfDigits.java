package day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {
       
		// Declare your input number (int)
		int n=123;

		// Initialize an integer variable by name: sum
		int sum=0;
		int r=0;

		// Use loop to calculate the sum: which loop to use until the number goes less than 10??

		// Within loop: get the remainder when done by 10 -> Tip: use mod
		while(n>=1) {
			r=n%10;
			// Print the remainder to confirm
			System.out.println("remainder is "+r);
			// Within loop: add that remainder to the sum
			sum=r+sum;
			// Print the sum to confirm
			System.out.println("sum is "+sum);
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			n=n/10;
	
		}
			// Print the quotient to confirm
		System.out.println("Final quotient is "+n);
		// Outside the loop: print the final sum
		System.out.println("Final Sum of given integer is "+sum);
	}

}
