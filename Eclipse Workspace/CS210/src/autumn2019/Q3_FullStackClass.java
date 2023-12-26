package autumn2019;

import java.util.Scanner;

public class Q3_FullStackClass {
	public static void main (String []args) {
		FullStack s = new FullStack(100);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String inputLine = sc.nextLine();
	
			if(inputLine.toUpperCase().contains("NORTH")) {
				s.push("Go North");
			}
			if(inputLine.toUpperCase().contains("SOUTH")) {
				s.push("Go South");
			}
			if(inputLine.toUpperCase().contains("WEST")) {
				s.push("Go West");
			}
			if(inputLine.toUpperCase().contains("EAST")) {
				s.push("Go East");
			}
			if(inputLine.toUpperCase().contains("BACK")) {
				s.pop();
			}				
			if(inputLine.toUpperCase().contains("ARRIVED")) {
				sc.close();
				break;
			}
		}
		
		while(!s.isEmpty()) {
			System.out.println(overturn(s.pop()));
		}
		
	}
	
	public static String overturn (String direction) {
		switch(direction) {
			case "Go North" : return "Go South";
			case "Go South" : return "Go North";
			case "Go West"  : return "Go East";
			case "Go East"  : return "Go West";
			default			: return null;	
		}
	}

}


class FullStack{
	private int maxSize; // size of stack array
	private String[] stackArray;
	private int top; // top of stack
	
	public FullStack(int s) { // constructor
		maxSize = s; // set array size
		stackArray = new String[maxSize]; // create array
		top = -1; // no items yet
	} 

	public void push(String j) { // nput item on top of stack
		top++;
		stackArray[top] = j; // increment top, insert item
	} 
	
	public String pop() { // take item from top of stack
		return stackArray[top--]; //access item, decrement top
	} 

	public boolean isEmpty() { // true if stack is empty
		return (top == -1);
	} 
}
