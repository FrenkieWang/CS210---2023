package january2016;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		
		// input the number of words to be sorted
		int N = Integer.parseInt(sc.nextLine());
		// input a line with N words, and put it in List
		for(int i = 0; i < N; i++) {
			String inputLine = sc.nextLine();
			list.add(inputLine);
		}
		sc.close();
		
		// Sort in reverse alphabetical order.
		Collections.sort(list, Collections.reverseOrder());
		
		// Print out the sorted words
		for(String s : list) {
			System.out.println(s);
		}
	}

}
