package january2015;

import java.util.Stack;

public class Q2 {
	public static void main (String args[]) {
		System.out.println(isPalindrome("acca"));
		System.out.println(isPalindrome("abc"));
	}
	
	public static boolean isPalindrome(String input) {
		Stack<Character> stack = new Stack<Character>();
		//Convert String into char Array
		char charArray[] = input.toCharArray();
		//Push each char into the Stack
		for(char c : charArray) stack.push(c);
		//Pop each char out of the Stack and compare
		for(char c : charArray) {
			if(stack.pop() != c) return false;
		}
		return true;
	}

}
