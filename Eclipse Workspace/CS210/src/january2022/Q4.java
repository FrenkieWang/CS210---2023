package january2022;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q4 {
	public static void main (String args[]) {		
		LinkedList <String> input = new LinkedList<String>();		
		Scanner sc = new Scanner(System.in);
		
		// Input total number of words
		int SIZE = sc.nextInt();
		sc.nextLine(); // change a new line to avoid bug
		// Input each word
		for (int i = 0; i < SIZE; i++) {
			input.add(sc.nextLine());
		}		
		sc.close();
		
		// Sort the List after input.
		Collections.sort(input, (new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// lower sum of ASCII has priority
				if(sumOfASCLL(o1) != sumOfASCLL(o2)) {
					return sumOfASCLL(o1) - sumOfASCLL(o2);
				}
				// REVERSE alphabetical order
				else {
					return o2.compareTo(o1);
				}
			}				
			
			// Calculate the total sum of the ASCII characters
			public int sumOfASCLL (String str) {
				int sum = 0;
				for(int i = 0; i < str.length(); i++) {
					sum = sum + (int)str.charAt(i);
				}
				return sum;
			}
		}));
		
		// Print out each element in the LinkedList
        for (String element : input) {
            System.out.println(element);
        }				
		
	}
}	
	/*
	【Question】 State the complexity of your program using Big O notation. 
	
	【Answer] The time complexity in my program is (N*log (N))
    Because if the element amount in Collection.sort() is very high,
    Java will use MergSort to change the order.
    
    In merge sort, if you want to use BinaryTree to divide N elements into
     one element,  you need log2(N) times.
    In each layer, every element should compare each other for N time.
    ThereforE the Big O Notation for mergesort is O(N*log(N)).       
    */    
	
	//https://blog.csdn.net/weixin_38314865/article/details/113839571	
	//https://blog.csdn.net/qq_40693171/article/details/79734456
	//https://blog.csdn.net/it_lihongmin/article/details/114319215
	
	/*
	System.out.println(sumOfASCLL("one")); //322
	System.out.println(sumOfASCLL("two")); //346
	System.out.println(sumOfASCLL("three")); //536
	System.out.println(sumOfASCLL("four")); //444
	System.out.println(sumOfASCLL("five")); //426
	System.out.println(sumOfASCLL("six")); //340
	System.out.println(sumOfASCLL("seven")); //545		
	System.out.println(sumOfASCLL("eight")); //529
	System.out.println(sumOfASCLL("nine")); //426
	System.out.println(sumOfASCLL("ten")); //327
	*/