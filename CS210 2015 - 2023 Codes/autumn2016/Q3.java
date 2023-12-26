package autumn2016;

public class Q3 {
	public static void main (String args[]) {

	}

}

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    // Method to delete the first half of the doubly-linked list
    public DoublyLinkedList deleteFirstHalf() {
        if (head == null) {
            // If the list is empty, nothing to delete
            return this;
        }

        // Count the number of nodes in the list
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Find the middle node (if the count is odd, middle node will be exactly at the center)
        int middle = 0;
        if(count % 2 == 1) {
        	//If nodes number is odd, middle node should also be deleted
        	middle = count / 2 + 1;
        }
        else {
        	middle = count / 2;
        }

        // Delete nodes until reaching the middle
        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }

        // Adjust pointers to delete the first half
        current.prev.next = null;
        current.prev = null;
        head = current;

        return this;
    }
}