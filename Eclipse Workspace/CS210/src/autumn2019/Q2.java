package autumn2019;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i < N ; i++) {
			int input = sc.nextInt();
			pq.add(input); // Input number into PriorityQueue
		}
		sc.close();
		
//		while(!pq.isEmpty()) {
//			System.out.print(pq.poll()+" ");
//		}
		
		double average;
		int SIZE = pq.size();
		for(int i=0; i<SIZE/2 -1; i++) {
			pq.poll();
		}
		if(SIZE % 2 == 0) {
			average = (double)(pq.poll() + pq.poll()) / 2.0;
		}
		else {
			pq.poll();
			average = (double) pq.poll();
		}
		System.out.println(average);		
	}
}
/*
 * Bio O Complexity: O (n * log(n))
 * PriorityQueue is actually a heap(Binary Tree), 
 * insert an element into a tree takes O(logn)
 * There is N element to be inserted, it takes O(n)
 * Therefore, the time complexity is O(n) * O(logn)
 */
