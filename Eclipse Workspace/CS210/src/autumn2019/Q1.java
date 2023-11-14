package autumn2019;

import java.util.Scanner;

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int nearestPrime = findNearestPrime(number);
		int distance = Math.abs(nearestPrime - number);
		System.out.println(distance);	
	}
	
	public static boolean isPrime(int number) {
		if (number <= 1) return false;	
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;			
		}
		
		return true;
	}
	
	public static int findNearestPrime(int input) {
		int largerPrime = input;
		int smallerPrime = input;
		while(true) {
			if(isPrime(largerPrime)) return	largerPrime;
			if(isPrime(smallerPrime)) return smallerPrime;
			largerPrime++;
			smallerPrime--;			
		}	
	}

}
