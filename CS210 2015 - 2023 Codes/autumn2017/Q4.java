package autumn2017;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Q4 {
	public static void main (String args[]) {
		Queue<String> commands = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);		
		while(true) {
			String inputLine = sc.nextLine();
			// If input empty String, close the scanner.
			if(inputLine.isEmpty()) {
				sc.close();
				break;				
			}	
			//If input includes "INSERT" at first, add element to the queue.
			if(inputLine.split(" ")[0].toUpperCase().equals("INSERT")) {
				commands.add(inputLine.split(" ")[1]);
			}
			//If input is "REMOVE", remove the first element.
			if(inputLine.toUpperCase().equals("REMOVE")) {
				if(!commands.isEmpty())	commands.remove();
			}		
		}
		
		// Get the middle string of priority queue.
		int SIZE = commands.size();
		String middleElement;
		for(int i = 0; i < SIZE / 2 - 1; i++) {
			commands.poll();
		}
		
		// Even number -> the middle two -> nearest the front		
		if(SIZE % 2 == 0) {
			middleElement = commands.peek();
		}
		// Odd number -> the middle one
		else {
			commands.poll();
			middleElement = commands.peek();
		}
		System.out.println(middleElement);
	}
}
/*
[Big O complexity] - O(n)
I use two for loops in the program,
First loop is to insert Command Lines, 
it is related to the number of commands. 
Second line is to get the median element in the queue,
it is related to the size of queue.
So the complexity is O(n) + O(n) = O(n)
*/