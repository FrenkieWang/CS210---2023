package labs;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Check if a number is prime");
			System.out.println("2. List prime numbers in a range");
			System.out.println("Choose an option (1 or 2): ");
			int option = sc.nextInt();
			System.out.println();
			
			if(option == 1) {
				System.out.println("Enter a number: ");
				int number = sc.nextInt();
				if(isPrime(number)) {
					System.out.println(number + " is a prime number");
				}
				else {
					System.out.println(number + " is not a prime number");
				}
				System.out.println();
			}
			else if (option == 2) {
				System.out.println("Enter the start of the range: ");
				int startRange = sc.nextInt();
				System.out.println("Enter the end of the range: ");
				int endRange = sc.nextInt();
				int []primeArray = getPrimeArray(startRange, endRange);
				System.out.print("Prime numbers in the range ["
				+ startRange + ", " + endRange + "]: ");		
				for(int i : primeArray) {
					System.out.print(i + " ");
				}
				System.out.println();	
				System.out.println();
			}
			else {	
				sc.close();
				break;
			}
		}
		System.out.println("Exit");
	}
	
	public static boolean isPrime(int number) {
		if(number <= 1) return false;
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;
		}
		
		return true;
	}
	
	public static int[] getPrimeArray(int startRange, int endRange) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = startRange; i <= endRange; i++) {
			if(isPrime(i)) list.add(i);
		}
		
		int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }
		return intArray;
	}

}
