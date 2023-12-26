package january2018;

import java.util.Scanner;

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		String inputLine = sc.nextLine();
		sc.close();
		System.out.println(LuhnAlgorithm(inputLine));
//		System.out.println(LuhnAlgorithm("4319474744826616"));	
//		System.out.println(LuhnAlgorithm("4539682995824395"));
	}
	
	// Check whether your bank card number is valid.
	public static String LuhnAlgorithm(String creditCardNumbers) {
		StringBuffer sb = new StringBuffer(creditCardNumbers);
		// From rightmost digit -> reverse the String
		String reversedString = sb.reverse().toString();
		// STEP 1: double every second digit and take the sum.
		int doubleSumOfEvenDigit = 0;	
		for(int i = 1; i < reversedString.length() ; i = i + 2 ) {
			int currentDigit = Character.getNumericValue(reversedString.charAt(i));
			currentDigit = currentDigit * 2;
			if(currentDigit >= 10) currentDigit = currentDigit - 9;
			doubleSumOfEvenDigit = doubleSumOfEvenDigit + currentDigit;
		}
		// STEP 2: take the sum of the rest digit.
		int sumOfOddDigit = 0;		
		for(int i = 0; i < reversedString.length() ; i = i + 2 ) {
			int currentDigit = Character.getNumericValue(reversedString.charAt(i));
			sumOfOddDigit = sumOfOddDigit + currentDigit;
		}
		// STEP 3: Check whether total modulo 10 is equal to 0.
		int moduloSum = sumOfOddDigit + doubleSumOfEvenDigit;		
		if(moduloSum % 10 == 0) {
			return "VALID";
		}
		else {
			return "INVALID";
		}
	}
}
