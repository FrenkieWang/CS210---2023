package january2018;

import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt(); // input a number 
		sc.close();
		
		int smallerPrime, biggerPrime;
		int distance;
		// If the number is Prime
		if(isPrime(inputNum)) {
			smallerPrime = inputNum;
			biggerPrime = findBiggerPrime(inputNum);
		}
		// If the number is not Prime
		else {
			smallerPrime = findSmallerPrime(inputNum);
			biggerPrime = findBiggerPrime(inputNum);
		}
		// Print out the distance
		distance = biggerPrime - smallerPrime;
		System.out.println(distance);
		
	}
	
	public static boolean isPrime (int number){
		if (number <= 1) return false;
		
		for (int i = 2; i< number; i++) { // O(n)
			if(number % i == 0) return false;
		}
		
		return true;
	}
	// Method: Get the Prime Number that precedes it
	public static int findSmallerPrime (int number) {
		int smallerPrime = number - 1;
		while(!isPrime(smallerPrime)) {
			smallerPrime--;
		}
		return smallerPrime;
	}
	// Method: Get the Prime Number that follows it
	public static int findBiggerPrime (int number) {
		int biggerPrime = number + 1;
		while(!isPrime(biggerPrime)) {
			biggerPrime++;
		}
		return biggerPrime;
	}
	/*[Big O Complexity] - O(n)
	  In this program, I use three methods - findSmallerPrime, findBiggerPrime and isPrime.
	  The input variable is "number" a
	   1) findSmallerPrime/ findBiggerPrime - Time Complexity O(1)
	   2) isPrime - Time Complexity O(n)
	    in the for loop is related with the input variable "number"
	   When we call 1), we must use 2) to check whether the input number is prime.
	   So the time complexity of the program is O(1） * O(n) = O(n)
	*/
}

