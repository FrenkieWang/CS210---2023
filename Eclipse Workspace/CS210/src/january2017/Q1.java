package january2017;

import java.util.Scanner;
// Utility -> 功用，效用，水电费，【计算机】实用工具包

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		// Number of inputs
		int N = Integer.parseInt(sc.nextLine());
		
		// Input the number and calculate their average
		int intArray [] = new int [N];	
		double sum = 0.0;
		double average = 0.0;		
		for (int i = 0 ; i < N ; i++) {
			int input = Integer.parseInt(sc.nextLine());
			intArray [i] = input;
			sum = sum + (double) input;
		}
		average = sum / (double) N;
		
		// Find the number closest to the average
		double minDifference = Integer.MAX_VALUE;
		int outputElement = 0;
		for (int i = 0 ; i < N ; i++) {
			double difference = Math.abs(average - (double)intArray[i]);
			/* If two values are equally close to the average, choose the one
			   which was earliset in the list, so we ignore '=' in the case . */
			if(difference < minDifference) {
				outputElement = intArray[i];
				minDifference = difference;				
			}
		}		
		
		System.out.println(outputElement);					
	}
}
/*
  [Big O complexity] - O(n)
  I use two for loops in the program,
  each loop is related to the input number N;
  So the complexity is O(N) + O（N） =  O(N) ;
*/
