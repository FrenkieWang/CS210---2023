package autumn2015;

import java.util.Set;
import java.util.HashSet;

public class Q3_b {
	public static void main (String args[]) {
		String example = "abbccda";
		System.out.println(checkUniqueChar(example));
		
	}
	
	public static int checkUniqueChar(String input) {
		char []inputChar = input.toCharArray();
		// HashSet can filter duplicate objects.
		Set<Character> s = new HashSet<Character>();
		for(char c : inputChar) {
			s.add(c);
		}
		return s.size();		
	}

}
