package labs;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;

public class Lab6 {
	public static void main (String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			String inputLine = sc.nextLine();
			list.add(inputLine);
		}
		sc.close();
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare (String o1, String o2) {
				if(scrabbleScore(o1) != scrabbleScore(o2)) {
					return scrabbleScore(o1) - scrabbleScore(o2);
				}
				else {
					return o1.compareTo(o2);
				}
			}
		});		
		
		for(String s: list) {
			System.out.println(s);
		}
	}
	
	public static int scrabbleScore (String input) {
		int score = 0;
		char []charArray = input.toUpperCase().toCharArray();
		for (char c : charArray) {			
			if ("AEIOULNSTR".contains(String.valueOf(c))){
				score = score + 1;
			}
			if ("DG".contains(String.valueOf(c))){
				score = score + 2;
			}
			if ("BCMP".contains(String.valueOf(c))){
				score = score + 3;
			}
			if ("FHVWY".contains(String.valueOf(c))){
				score = score + 4;
			}
			if ("K".contains(String.valueOf(c))){
				score = score + 5;
			}
			if ("JX".contains(String.valueOf(c))){
				score = score + 8;
			}
			if ("QZ".contains(String.valueOf(c))){
				score = score + 10;
			}			
		}
		return score;		
	}
}
