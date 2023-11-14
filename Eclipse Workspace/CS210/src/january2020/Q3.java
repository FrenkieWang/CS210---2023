package january2020;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Q3 {
	public static void main (String args[]) {
		Queue<String> queue = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String inputLine = sc.nextLine();
			// INSERT Command
			if(inputLine.split(" ")[0].toUpperCase().equals("INSERT")) {
				queue.add(inputLine.split(" ")[1]);
			}
			// REMOVE Command
			if(inputLine.toUpperCase().equals("REMOVE")) {
				/* If a remove command is issued for an 
				   empty queue, then nothing should happen. */
				queue.poll();
			}
			// End inputs with an empty string
			if(inputLine.isEmpty()) {
				sc.close();
				break;
			}
		}
		/*
		// Test: print out the queue
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		*/
		// Output the string in the middle of the queue
		int SIZE = queue.size();
		for (int i = 0; i < SIZE/2 -1; i++) {
			queue.poll();
		}
		// Two middle String, output the one nearest the front
		if (SIZE % 2 == 0) {
			System.out.println(queue.peek());
		}
		// One middle String, output that middle one.
		else {
			queue.poll();
			System.out.println(queue.peek());
		}
	}

}
