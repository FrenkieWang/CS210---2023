package autumn2015;

public class Q2 {
	

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

    // Other methods...

    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            current.prev = next; // If you want to maintain doubly linked list property
            previous = current;
            current = next;
        }

        head = previous; // Update the head to the last node (new first node).
    }

    // Other methods...
}