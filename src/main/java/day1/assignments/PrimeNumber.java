package day1.assignments;

public class ArmstrongNumber {
	
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
<<<<<<< HEAD
=======

		// Declare an int Input and assign a value
		int input = 13;
		// Declare a boolean input as flag
		boolean flag=false;
		// Iterate from 1 to half of the input
		for (int i = 0; i < input/2; i++) {
>>>>>>> branch 'master' of https://github.com/pavankappa/repository
		
<<<<<<< HEAD
		// Declare your input
		int n=153;
		int mul=1;
=======
			// Divide the input with each for loop variable and check the remainder
			int rem=input%2;
				// Set the flag as true when there is no remainder
				if (rem==0) {
					flag=true;
				// break the iterator
					break;
				}
		}		
>>>>>>> branch 'master' of https://github.com/pavankappa/repository
		
<<<<<<< HEAD
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated=0;
		int r;
		
		// Assign input into variable original 
		int org=153;
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		while(n>0)
		{
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			r=n%10;
			System.out.println(r);
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			n=n/10;
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			System.out.println(n);
			mul=r*r*r;
			System.out.println(mul);
			calculated=mul+calculated;
			System.out.println(calculated);
		}
		
		// Check whether calculated and original are same
		if(calculated==org){
=======
				// Check the flag (Provide a condition)
				if(flag==false) {
					System.out.println("prime number");
				}
			// Print 'Prime' when the condition matches
>>>>>>> branch 'master' of https://github.com/pavankappa/repository
			
<<<<<<< HEAD
			//When it matches print it as Armstrong number
			System.out.println("Given input is Armstrong Number"+calculated);
			
		}else {
			System.out.println("Not Armstrong number"+calculated);
		
		
		
		
		
		
		
		
		
=======
			// Print 'Not a Prime' when the condition doesn't match 
>>>>>>> branch 'master' of https://github.com/pavankappa/repository
		
	}

	}
}