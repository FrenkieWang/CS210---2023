package autumn2016;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class Q2_Interface {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> pq = new PriorityQueue<Integer>(
			new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
			}
		});
		
		// Number of Inputs
		int N = Integer.parseInt(sc.nextLine());
		// N integers separated by a space.
		for(int i = 0; i < N ; i++) {
			int inputNum = sc.nextInt();
			pq.add(inputNum);			
		}
		sc.close();
		
		// Print out sorted Integer
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}
	} 
}