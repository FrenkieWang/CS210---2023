package autumn2018;

import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);		
		// input number of coins tosses
		int TOSSES = Integer.parseInt(sc.nextLine());
		// input target number of tails
		int TAILS = Integer.parseInt(sc.nextLine()); 
		sc.close();
		
		//Monte Carlo
		int N = 1000000;
		int count = 0;		
		for(int i = 0; i < N; i++) {
			int tailToss = 0;
			for (int j = 0; j < TOSSES; j ++) {
				/* create random number: 0 or 1
				   50% will be 0 -> coin tails
				   50% will be 1 -> coin head */
				int status = (int) (2 * Math.random());
				if(status == 0) tailToss ++;
			}
			if (tailToss >= TAILS) count++;			
		}
		
		double p = (double) 100 * count / (double) N; 
		// Round up to the nearest Integer 93.75 -> 94
		System.out.println(Math.round(p));
	}
}
