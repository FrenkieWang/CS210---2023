package autumn2016;

import java.util.Scanner;
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		myPriorityQueue myPQ = new myPriorityQueue();
		
		// Number of Inputs
		int N = Integer.parseInt(sc.nextLine());
		// N integers separated by a space.
		for(int i = 0; i < N ; i++) {
			int inputNum = sc.nextInt();
			myPQ.add(inputNum);			
		}
		sc.close();
		
		// Print out sorted Integer
		while(!myPQ.isEmpty()) {
			System.out.print(myPQ.remove() + " ");
		}
	} 
}

//Write my own Priority Queue class
class myPriorityQueue{
	// Sort Integers from higher to lower
	Queue<Integer> pq = new PriorityQueue<Integer>(
			new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}		
	});
	
	 public void add(Integer item) {
		 pq.add(item);
	 }
	 
	 public int remove() {
	     return pq.remove();
	 }
	 
	 public boolean isEmpty() {
	     return pq.isEmpty();
	 }
	 
}
