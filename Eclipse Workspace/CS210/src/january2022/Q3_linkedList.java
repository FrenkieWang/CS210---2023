package january2022;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Q3_LinkedList {
	public static void main (String args[]) {  
        Scanner scanner = new Scanner(System.in);
		LinkedList <String> priorityQueue = new LinkedList<String>();
		
        while (true) {
            String userInput = scanner.nextLine();
            
            //If input includes "INSERT" at first, use add element to the queue.
            if(userInput.split(" ")[0].toUpperCase().equals("INSERT")) {
            	priorityQueue.add(userInput.split(" ")[1]);
            }
            
            //If input is "REMOVE", sort the queue first and remove the first element.
            if(userInput.toUpperCase().equals("REMOVE")) {

        		Collections.sort(priorityQueue, (new Comparator<String>() {
        			@Override
        			public int compare(String o1, String o2) {
        				// 1 - More Vowel has higher priority
        				if(countVowels(o2)!=countVowels(o1)) {
        					return countVowels(o2) - countVowels(o1);
        				}
        				// 2 - If same, longer word has higher priority
        				else if (o2.length()!= o1.length()) {
        					return o2.length() - o1.length();
        				}
        				// 3 - else, remain the input sequence
        				else {
        					return 1;
        				}
        			}
        			
        			//Compare the Vowels
        			public static int countVowels(String str) {
        		        int count = 0;
        		        for (int i = 0; i < str.length(); i++) {
        		            char ch = Character.toLowerCase(str.charAt(i));
        		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        		                count++;
        		            }
        		        }
        		        return count;
        		    }
        		}));
        		//  If a remove command is issued for an empty queue then nothing should happen. 
            	if(!priorityQueue.isEmpty()) priorityQueue.poll();
            }

            // If input empty String, close the scanner.
            if (userInput.isEmpty()) {
            	scanner.close();
            	break;
            }    
            // Make a new input line, ignore other invalid input.
        }
        
        /*
        // Test: Get all the element in the queue
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        */
		
        // Get the middle string of priority queue.
		int size = priorityQueue.size();
		String middleElement;
        for (int i = 0; i < size / 2 - 1; i++) {
        	priorityQueue.poll();
        }
        // Even number -> the middle two -> nearest the front
        if(size % 2 == 0) {
        	middleElement = priorityQueue.peek();
        // Odd number -> the middle one
        } else {
        	priorityQueue.poll();
        	middleElement = priorityQueue.peek();
        }
        System.out.println(middleElement);
	}
	
}
