package january2020;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Queue<String> pq = new PriorityQueue<String> ( new Comparator<String>() {
			@Override
			public int compare (String o1, String o2) {
				// 1 - more unique letters first
				if(countUniqueChar(o1) != countUniqueChar(o2)) {
					return (countUniqueChar(o2)-countUniqueChar(o1));
				}
				// 2 - If unique letter is same -> lexicographically
				else {
					return o1.compareTo(o2);
				}
			}			
			// Use Set to calculate the number of unique letter.
			// Set can filter the duplicate letter.
			public int countUniqueChar(String input) {
				Set<Character> uniqueChar = new HashSet<Character>();				
				for(char c : input.toCharArray()) {
					uniqueChar.add(c);
				}				
				return uniqueChar.size();				
			}
		}); // end of Queue and its Comparator
		
		Scanner sc = new Scanner(System.in);
		int SIZE = 10000;
		for (int i = 0; i < SIZE; i++) {
			pq.add(sc.nextLine());
		}
		sc.close();
		// Print out all sorted String in PriorityQueue
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}		
	}

}
