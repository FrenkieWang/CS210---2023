package january2015;

import java.util.Scanner;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;

public class Q4 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		LinkedList<String> list = new LinkedList<String>();
		
		//Input the String, ends by empty String
		while(true) {
			String inputLine = sc.nextLine();
			if(inputLine.isEmpty()) {
				sc.close();
				break;
			}
			list.add(inputLine);
		}
		
		//The sort method is in O(nlogn) time
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 1 - short String has priority
				if(o1.length() != o2.length()) {
					return o1.length()-o2.length();
				}
				// 2 - Alphabetically
				else {
					return o1.compareTo(o2);
				}
			}
		});
		
		//Print out the sorted String
		for(String s: list) {
			System.out.println(s);
		}
		
	}

}
