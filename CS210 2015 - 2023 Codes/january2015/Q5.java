package january2015;

import java.util.Set;
import java.util.TreeSet;

public class Q5 {
	public static void main (String args[]) {		
		//Monte Carlo Simulation
		int N = 1000000;
		int count = 0;
		
		MONTECARLO:
		for(int i = 0; i < N; i++) {
			// Create a lottery to store 6 numbers drawn from 1 to 45
			// drawn from 1 to 45, and sort them!
	        Set<Integer> lottery = new TreeSet<>();	        
	        while(lottery.size() < 6) {
	        	int draw = (int) (45 * Math.random()) + 1;
	        	lottery.add(draw);        	
	        }
	        
	        //Convert TreeSet to Array
	        Integer[] lotteryArray = lottery.toArray(new Integer[lottery.size()]);
	        
	        //Check whether lottery has consecutive pairs of numbers
	        for(int j = 1; j < lotteryArray.length; j++) {
	        	if(lotteryArray[j] == lotteryArray[j-1] + 1 ) {
	        		// If has consecutive pairs of numbers, go to next loop
	        		continue MONTECARLO;
	        	}
	        }
	        // If does not have consecutive pairs of numbers, count it.
	        count++;
		}
		
		// Print out the probability, retain 2 digits
		double probability = (double)(100 * count) / (double)N;
		System.out.printf("Probability of Lottery: %.2f", probability);			
	}
}
