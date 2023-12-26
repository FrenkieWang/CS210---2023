package january2016;

import java.util.Scanner;

public class Q3_FullStackClass {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		String sentence = sc.nextLine();
		sc.close();
		if(isPalindrome(sentence)) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}			
	}
	
	// Check whether the String is Palindrome
	public static boolean isPalindrome(String input) {
		FullStack s = new FullStack(100);		
		// Convert String to char Array, all lower case.
		char []charArray = input.toLowerCase().toCharArray();		
		// Input all char from first to last
		for (char c: charArray) s.push(c);		
		// Check char from last to first
		for (char c: charArray) {
			if(c != s.pop()) return false;
		}
		return true;
	}
}

class FullStack{
	private int maxSize; // size of stack array
	private char[] stackArray;
	private int top; // top of stack
	
	public FullStack(int s) { // constructor
		maxSize = s; // set array size
		stackArray = new char[maxSize]; // create array
		top = -1; // no items yet
	} 

	public void push(char j) { // nput item on top of stack
		top++;
		stackArray[top] = j; // increment top, insert item
	} 
	
	public char pop() { // take item from top of stack
		return stackArray[top--]; //access item, decrement top
	} 
}
