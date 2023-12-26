package january2016;

import java.util.Stack;
import java.util.Scanner;

public class Q3 {
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
		MyCharStack s = new MyCharStack();
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

// Write my own Stack class
class MyCharStack {
    Stack<Character> stack = new Stack<Character>();

    public void push(Character item) {
        stack.push(item);
    }

    public char pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}