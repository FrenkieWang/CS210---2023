package january2019;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Q3_Interface {
	public static void main (String args[]) {
		Queue<Integer> q = new LinkedList<Integer>();
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
				q.add(insertNum);
			}
			if(input.toUpperCase().equals("REMOVE")) {
			/* If a remove command is issued for an empty queue
			   then nothing should happen. */
				if(!q.isEmpty()) q.remove();
			}			
		}		
		System.out.println(q.peek());
	}
}