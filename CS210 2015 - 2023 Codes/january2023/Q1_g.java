package january2023;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Q1_g {
	public static void main (String args[]) {
		Queue <Integer> pq = new PriorityQueue<Integer>(
				new Comparator <Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2 - o1;
					}
				});
		pq.add(35); System.out.println("Step 1: Insert 35"); printPQ(pq);
		pq.add(19); System.out.println("Step 2: Insert 19"); printPQ(pq);
		pq.add(43); System.out.println("Step 3: Insert 43"); printPQ(pq);
		pq.remove(); System.out.println("Step 4: Remove"); printPQ(pq);
		pq.add(98); System.out.println("Step 5: Insert 98"); printPQ(pq);
		pq.remove(); System.out.println("Step 6: Remove"); printPQ(pq);
		pq.remove(); System.out.println("Step 7: Remove"); printPQ(pq);
		pq.add(69); System.out.println("Step 8: Insert 69"); printPQ(pq);
		pq.remove(); System.out.println("Step 9: Remove"); printPQ(pq);
//		System.out.print(pq.poll());		
	}
	
	public static void printPQ(Queue<Integer> pq) {
        PriorityQueue<Integer> pqCopy = new PriorityQueue<>(pq);

        while (!pqCopy.isEmpty()) {
            System.out.print(pqCopy.poll() + " ");
        }
        System.out.println();
	}

}
