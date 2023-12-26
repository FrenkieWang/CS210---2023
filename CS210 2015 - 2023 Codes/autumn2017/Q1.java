package autumn2017;

import java.util.Scanner;

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		// Input three number
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		int mostDiff = 0;	
		boolean noDiff = false;
		// Calculate the difference between each 2 numbers
		int diff12 = Math.abs(num1 - num2);
		int diff13 = Math.abs(num1 - num3);
		int diff23 = Math.abs(num2 - num3);		
		// Find the most different number
		if(diff12 > diff23 && diff13 > diff23) mostDiff = num1;
		else if (diff12 > diff13 && diff23 > diff13) mostDiff = num2;
		else if (diff23 > diff12 && diff13 > diff12) mostDiff = num3;
		// All the difference are same
		else noDiff = true;
		
		if(noDiff) {
			System.out.println("NA");
		}
		else {
			System.out.println(mostDiff);
		}
	}

}
