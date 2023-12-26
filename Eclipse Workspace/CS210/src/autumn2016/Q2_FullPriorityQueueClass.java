package autumn2016;

import java.util.Scanner;

public class Q2_FullPriorityQueueClass {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		FullPriorityQueue pq = new FullPriorityQueue(100);
		
		// Number of Inputs
		int N = Integer.parseInt(sc.nextLine());
		
		// N integers separated by a space.
		for(int i = 0; i < N ; i++) {
			int inputNum = sc.nextInt();
			pq.insert(inputNum);			
		}
		sc.close();
		
		// Print out sorted Integer
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}		
	}
}

class FullPriorityQueue{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int nItems;
	
	public FullPriorityQueue(int s) { // constructor
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		nItems = 0;
	}
	
	// insert item from large to small
	public boolean insert(int item) { 		
		if (nItems == 0) {
			// If queue is empty, insert it directly.
            queArray[nItems++] = item; 
        } else {
            int position; // the position to insert
            // find the postion from back to front
            for (position = nItems - 1; position >= 0; position--) {
            	// if element is smaller, move element backwards
                if (item > queArray[position]) { 
                    queArray[position + 1] = queArray[position]; 
                // find the element, end the loop.
                } else {
                    break; 
                }
            }
            // insert the element in that slot.
            queArray[position + 1] = item; 
            nItems++;
        }		
		return true; //successfully inserted
	} 
	
	public boolean isEmpty() { // true if queue is empty
		return (nItems==0);
	} 
	
	public int remove() { // take item from front of queue
		if(isEmpty()) return (Integer) null; //don’t remove if empty
		int temp = queArray[front];// get value and incr front
		front++;
		// deal with wraparound
		if(front == maxSize) front = 0;
		nItems--; // one less item
		return temp;
	} 
}