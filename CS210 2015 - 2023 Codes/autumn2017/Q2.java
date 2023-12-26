package autumn2017;

import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		// Input number of coin tosses
		int N = Integer.parseInt(sc.nextLine());
		// Input target number of heads
		int H = Integer.parseInt(sc.nextLine());
		sc.close();
		
		//Monte Carlo Simulation
		int ALL = 1000000;
		int count = 0;
		
		for(int i = 0; i < ALL ; i++) {	
			int consecutiveHeads = 0;
			
			for (int j = 0; j < N; j ++) {
				// If toss = 0 - > Tail
				// If toss = 1 - > Head
				int toss = (int) (2 * Math.random());
				
				//If get a HEAD, accumulate the times
				if(toss == 1) {
					consecutiveHeads++;
				}
				//If get a TAIL, set times back to 0
				else {
					consecutiveHeads = 0;
				}
				// Observe H heads in a row
				if(consecutiveHeads == H) {
					count ++ ;
				}
			}
		}
		double p = (double)(count * 100)/ (double) ALL;
		System.out.println(Math.round(p));
	}
}
/*
[Big O complexity] - O(n^2)
I use two for loops in the program,
Outer loop is related to ALL -- the times of Monte Carlo Simulation
Inner loop is related to N -- Input number of coin tosses
So the complexity is O(n^2))
*/
