package january2016;

import java.util.Scanner;

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		sc.close();
		
		int nearestPrime = findNearestPrime(inputNum);
		System.out.println(nearestPrime);		
	}
	
	// Find nearest Prime
	public static int findNearestPrime(int input) {		
		int lowerPrime = input;
		int upperPrime = input;
		while(!isPrime(lowerPrime)) lowerPrime--;
		while(!isPrime(upperPrime)) upperPrime++;
		if(Math.abs(lowerPrime - input) > Math.abs(lowerPrime - input)) {
			return upperPrime;
		}
		// If two primes are equidistant then output the lower one.
		else  {
			return lowerPrime;
		}
	}
	
	//Check whether the number is Prime
	public static boolean isPrime(int number) {
		if (number <= 1) return false;	
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;			
		}
		
		return true;
	}

}
