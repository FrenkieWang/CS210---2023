package january2019;

import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return getCollatzSteps(o2) - getCollatzSteps(o1);
			}
		});
		
		while(true) {		
			String inputLine = sc.nextLine();
			if(inputLine.isEmpty()) {
				sc.close();
				break;
			}
			int inputNum = Integer.parseInt(inputLine);
			pq.add(inputNum); // O(n*logn) n: number of input 
		}
		
		while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
	}
	
	public static int getCollatzSteps (int input) {
		int steps = 0;
		while(input>1) { // 
			if(input % 2 == 0) {
				input = input / 2;
			}
			else {
				input = input * 3 + 1;
			}
			steps++;
		}
		return steps;		
	}
}
/*
   Big-O Complexity is time complexity,  it is a concept that describes
    the speed of an algorithm according to the size of input. 
   The Big-O Complexity in my program is O(n*logn)
 */
