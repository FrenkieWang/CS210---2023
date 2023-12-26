package autumn2022;

public class Q1 {
	public static void main (String args[]) {
		int largestPalindrome = 0;
		int n1 = 0;
		int n2 = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (isPalindrome(i*j)) {
					if(largestPalindrome < i * j) {
						largestPalindrome = i * j;
						n1 = i;
						n2 = j;
					}
				}
			}
		}
		
		System.out.println("Largest Palindrome of 3-digit numbers is "
				+ n1 + " * " + n2 + " = "  + largestPalindrome);		
	}
	
	public static boolean isPalindrome(int num) {
		String numStr = String.valueOf(num);
		StringBuffer sb = new StringBuffer(numStr);
		String reverseNumStr = sb.reverse().toString();
		if (numStr.equals(reverseNumStr)) {
			return true;
		}
		else {
			return false;
		}			
	}
}
