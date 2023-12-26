package january2022;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class Q3_PriorityQueue {
	public static void main (String args[]) {  
		PriorityQueue <String> q = new PriorityQueue<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// More Vowel has higher priority
				if(countVowels(o2)!=countVowels(o1)) {
					return countVowels(o2) - countVowels(o1);
				}
				// If same, longer word has higher priority
				else if (o2.length()!= o1.length()) {
					return o2.length() - o1.length();
				}
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
		});		
		
		//   it do to is
		q.add("this");
		q.add("is");
		q.add("how");
		q.add("to");
		q.remove();
		q.add("do");
		q.remove();
		q.add("it");
		
		
		// 从优先级队列中取出并输出字符串
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
		
		int size = q.size();
		String middleElement;
        for (int i = 0; i < size / 2 - 1; i++) {
            q.remove();
        }
        // Even number -> the middle two -> nearest the front
        if(size % 2 == 0) {
        	middleElement = q.peek();
        // Odd number -> the middle one
        } else {
        	q.poll();
        	middleElement = q.peek();
        }
        System.out.println(middleElement);
	}

}
