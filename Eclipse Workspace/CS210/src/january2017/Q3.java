package january2017;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class Q3 {
	public static void main(String[] args) {
        List<String> words = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        // number of words followed by N lines
        int N = Integer.parseInt(sc.nextLine());
        // Each line contains a String
        for(int i = 0; i < N; i++) {
        	String inputLine = sc.nextLine();
        	words.add(inputLine);
        }        
        sc.close();
        
        Collections.sort(words, new Comparator<String>() {
        	@Override
        	public int compare (String s1, String s2) {
        		String []alphabet = {"a","b","c","d","e","f","g",
                		"h","i","j","k","l","m","n","o","p","q",
                		"r","s","t","u","v","w","x","y","z"};
        		// Sort the words by the earliest character
                for (int i = 0; i < 26; i++) {
                	if(s1.contains(alphabet[i]) && !s2.contains(alphabet[i])) return -1;
                	else if(!s1.contains(alphabet[i]) && s2.contains(alphabet[i])) return 1;
                	else continue;        	
                }
                // If two words use same characters -> alphabetical order
                return s1.compareTo(s2);
        	}
        });        

        // Print out the sorted words
        for(String element:words) {
        	System.out.print(element + " ");
        }
    }
}
/*
	[Big O complexity] - O(n * log(n))
	1) When I add elements into LinkedList 
	or output the element from the LinkedList
	they are related to the number of words,
	so the time complexity is O(n)
	2) When I use Collection.sort(), it will use merge sort 
	if the number of input is very high.
	The time complexity of merge sort is O(n * log(n))
	Therefore, the time complexity of this program is
	O(n) + O(n * log(n)) + O(n) = O(n * log(n))
*/

