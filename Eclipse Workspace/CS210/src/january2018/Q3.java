package january2018;

public class Q3 {

}

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    // Method to delete links with value less than 100
    public DoublyLinkedList deleteLinksLessThan100(DoublyLinkedList list) {
        Node currentNode = list.head;
        while (currentNode != null) {
            // Save the next node before deletion
            Node nextNode = currentNode.next;
            
            // Delete the link if its value is less than 100
            if (currentNode.data < 100) {
                // Adjust the previous and next pointers
                if (currentNode.prev != null) {
                    currentNode.prev.next = currentNode.next;
                } else {
                    list.head = currentNode.next;
                }
                
                if (currentNode.next != null) {
                    currentNode.next.prev = currentNode.prev;
                } else {
                    list.tail = currentNode.prev;
                }
            }
            
            // Move to the next node
            currentNode = nextNode;
        }
        // Return the modified doubly-linked list.
        return list;
    }
}
/*
	Time Complexity - O(N)
	N is the number of nodes in the input doubly-linked list. 
	If you want to traverse the List, you should iterate N times.
*/
