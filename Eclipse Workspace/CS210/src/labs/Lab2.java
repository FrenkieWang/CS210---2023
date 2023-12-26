package labs;

import java.util.Scanner;

public class Lab2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String card = sc.nextLine();
		StringBuffer sb = new StringBuffer(card);
		String reverseCard = sb.reverse().toString();
		
		int checkDigit1 = 0;
		int checkDigit2 = 0;
		for(int i = 0; i<reverseCard.length(); i++) {
			// Get the digit from rightmost to left
			int digit = Character.getNumericValue(reverseCard.charAt(i));
			// Sum of Even Digit
			if(i % 2 == 0) {
				checkDigit1 = checkDigit1 + digit;
			}// Sum of Odd Digit
			else {
				checkDigit2 = checkDigit2 + luhnAlgorithm(digit);
			}
		}		
		
		// Check whether total modulo 10 equals 0?
		int sum = checkDigit1 + checkDigit2;
		if(sum % 10 == 0) {
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID");
		}
		
	}
	
	public static int luhnAlgorithm(int number) {
		int output = number * 2;
		if(output > 9) {
			output = output - 9;
		}
		return output;
	}


}
