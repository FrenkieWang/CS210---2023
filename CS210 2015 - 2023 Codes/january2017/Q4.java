package january2017;

import java.util.*; 

public class Q4 {
	public static void main (String args[]) {
		Scanner myscanner = new Scanner(System.in); 
		 int num = Integer.parseInt(myscanner.nextLine()); 
	        Link[] array = new Link[num]; 
	        for(int i=0;i<num;i++){ 
	            array[i]=new Link(myscanner.nextLine());     
	        } 
	        while(myscanner.hasNext()){ 
	            int select=myscanner.nextInt(); 
	            int next=myscanner.nextInt(); 
	            System.out.println("Onetime");
	            if(next!=-1){ 
	                array[select].next=array[next]; 
	            } 
	            else{ 
	                break; 
	            } 
	        } 
	        LinkedList mylist = new LinkedList(); 
	        if(num>0){ 
	            mylist.first=array[0]; 
	        } 
	        System.out.println(findLoopLength(mylist));
	}

	public static int findLoopLength(LinkedList mylist){       
		/*return 0 if empty or no loop, otherwise length of loop in mylist*/ 
		
		/* Floyd's cycle-finding Algorithm
		   FAST pointer moves 2 steps in one time
		   SLOW pointer moves 1 steps in one time
		   If there has a loop, FAST will finally catch up with SLOW. */
		Link slow = mylist.first;
		Link fast = mylist.first;
		boolean hasLoop = false;
		
		//Find whether has a LOOP 		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				hasLoop = true;
				break;
			}
		}
		
		// Calculate the length of Loop		
		// No LOOP/ Empty List -> default value 0
		int loopLength = 0;
		if (hasLoop) {
			do {
				fast = fast.next;
				loopLength++;
			} while (fast != slow);
		}
		
		return loopLength; 
	} 
} 

class Link{ 
    public String data; 
    public Link next; 
     
    public Link(String input){ 
        data = input; 
        next = null; 
    } 
} 
 
class LinkedList { 
    public Link first; 
 
    public LinkedList( ){ 
    	first=null; 
    } 
 
    public boolean isEmpty( ){ 
    	return (first==null); 
    } 
     
    public void insertHead(Link insert){ 
        if(isEmpty()){ 
            first=insert; 
        }else{ 
            insert.next=first; 
            first=insert; 
        } 
    } 
} 
/*
	[Big O complexity] - O(n)
	In the method, there is one while loop.
	The loop is related with the num of Link.
	So the Big O Complexity is O(n).
*/