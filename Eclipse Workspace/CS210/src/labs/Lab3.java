package labs;

import java.util.Scanner;

public class Lab3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int boundary1 = sc.nextInt();
		int boundary2 = sc.nextInt();
		int count = 0;
		for(int i = boundary1; i <= boundary2; i++) {
			if(isPrime(i)) count++;
		}		
		System.out.println(count);		
	}
	
	public static boolean isPrime(int number) {
		if(number <= 1) return false;
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;
		}
		
		return true;
	}
	


}
