package autumn2022;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class Q4 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		LinkedList <String> input = new LinkedList <String>();
		int SIZE = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < SIZE; i++) {
			input.add(sc.nextLine());
		}
		
		Collections.sort(input, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}
				else {
					return o1.compareTo(o2);
				}
			}
		});
		
		for(String element : input ) {
			System.out.println(element);
		}
		
	}

}
