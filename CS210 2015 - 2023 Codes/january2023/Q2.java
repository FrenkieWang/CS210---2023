package january2023;

import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int distance = 0;
		int upperNum = input;
		int lowerNum = input;
		// If neither upperNum nor lowerNum is Prime, add a distance.
		while(!checkPrime(upperNum) && !checkPrime(lowerNum)) {
			upperNum ++;
			lowerNum --;
			distance ++;
		}
		System.out.println(distance);			
	}
	
	public static boolean checkPrime (int input) {
		if(input <= 1)  return false;
		
		for(int i = 2; i < input; i++) {
			if (input % i == 0) return false;
		}
		return true;
	}
}
