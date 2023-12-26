package january2017;

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		// Input the quantity number used in the lottery
		int N = Integer.parseInt(sc.nextLine());
		// Input the quantity number drawn in a lottery draw
		int D = Integer.parseInt(sc.nextLine());
		sc.close();
		
		// Use Monte Carlo Model
		int ALL = 1000000;
		int count = 0;
		
		MONTECARLO:
		for (int i = 0; i < ALL; i++) {			
			//Create a new drawbox and put it into Set.			
			Set<Integer> uniqueNumbers = new LinkedHashSet<Integer>();
			// Use LinkedHashSet to avoid duplicate and remember the input sequence.
			while(uniqueNumbers.size() < D) {
				// Select one number from Lottery [1,2....,N]
				int randomNumber = (int) (N * Math.random() + 1);
				uniqueNumbers.add(randomNumber);
			}		
			
			// Convert to ArrayList to check whether the drawn numbers are ASCending
			List<Integer> list = new ArrayList<>(uniqueNumbers);
	        for (int j = 1; j < list.size(); j++) {
	        	// Not ascending, continue to the next Monte Carlo
	            if (list.get(j - 1) > list.get(j)) {
	                continue MONTECARLO;
	            }
	        }
	        // Ascending, count a time
	        count++;				
		}
		
		// Calculate the probability into percentage
		double p = (double)(count * 100)/ (double) ALL;
		// Round up to the nearest Integer
		System.out.println(Math.round(p));
	}
}
/*
	[Big O complexity] - O(n^2)
	I use two for loops in the program,
	 The outer loop is related to ALL --
	 (the simulation times of Monte Carlo Simualtion).
	 The inner loop is related to D --
	 (the quantity number drawn from lottery).
	 So the complexity is O(N) * O（N） =  O(N^2);
*/
