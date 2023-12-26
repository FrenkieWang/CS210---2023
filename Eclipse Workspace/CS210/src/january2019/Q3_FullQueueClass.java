package january2019;

import java.util.Scanner;

public class Q3_FullQueueClass {
	public static void main (String args[]) {
		FullQueue q = new FullQueue(100);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			if(input.isEmpty()) {
				sc.close();
				break;
			}
			if(input.split(" ")[0].toUpperCase().equals("INSERT")){
				String insertNumStr = input.split(" ")[1];
				int insertNum = Integer.parseInt(insertNumStr);
				q.insert(insertNum);
			}
			if(input.toUpperCase().equals("REMOVE")) {
			/* If a remove command is issued for an empty queue
			   then nothing should happen. */
				if(!q.isEmpty()) q.remove();
			}			
		}		
		System.out.println(q.remove());
	}
}

class FullQueue{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public FullQueue(int s) { // constructor
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public boolean insert(long j) { // put item at rear of queue
		// deal with wraparound
		if(rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queArray[rear] = j; // increment rear and insert
		nItems++; // one more item
		return true; //successfully inserted
	} 
	
	public long remove() { // take item from front of queue
		if(isEmpty()) return (Long) null; //don’t remove if empty
		long temp = queArray[front];// get value and incr front
		front++;
		// deal with wraparound
		if(front == maxSize) front = 0;
		nItems--; // one less item
		return temp;
	} 
	
	public boolean isEmpty() { // true if queue is empty
		return (nItems==0);
	} 
}