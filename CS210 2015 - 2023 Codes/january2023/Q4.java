package january2023;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;

public class Q4 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>(); 		
		// Input a list of n English words
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String inputLine = sc.nextLine();
			list.add(inputLine);
		}	
	
		// Sort the list
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(getUniqueChar(s1) != getUniqueChar(s2)) {
					// 1 - Fewer unique Char first
					return getUniqueChar(s1) - getUniqueChar(s2);
				}
				else {
					// 2 - Alphabetically
					return s1.compareTo(s2);
				}
			}
		});
		
		// Print the output
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	//Use HashSet to get the number of Unique Char in a word
	public static int getUniqueChar(String input) {
		Set<Character> s = new HashSet<Character>();
		char[] charArray = input.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			s.add(charArray[i]);
		}
		int uniqueChar = s.size();
		return uniqueChar;
	}
}
