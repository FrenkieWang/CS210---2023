package autumn2018;

import java.util.Scanner;
import java.util.Stack; 

public class Q3 {
	public static void main (String arg[]) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);	
		
		// Number of Commands
		int N = Integer.parseInt(sc.nextLine());		
		for(int i = 0; i < N ; i++) {
			String inputLine = sc.nextLine();
			
			//PUSH Commands
			if(inputLine.split(" ")[0].toUpperCase().equals("PUSH")) {
				int inputNum = Integer.parseInt(inputLine.split(" ")[1]);
				s.add(inputNum);				
			}
			//POP Commands
			if(inputLine.toUpperCase().equals("POP")) {
				//When stack is empty, nothing happens.
				if(s.empty()) {
					break;
				}
				else {
					s.pop();
				}
			}
		}
		sc.close();
		
		// If stack is empty, then output "empty"
		if(s.empty()) {
			System.out.println("empty");
		}// output the Integer at the top of the stack
		else {
			System.out.println(s.peek());
		}		
	}
}
