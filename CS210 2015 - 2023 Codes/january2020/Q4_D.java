package january2020;

public class Q4_D {
//https://blog.csdn.net/rocling/article/details/103834968
}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DoubleEndedLinkedList {
    Node head;
    Node tail;
    
    public DoubleEndedLinkedList() {
    	head = null;
    	tail = null;
    }    

    // Method to delete the tail node of the linked list
    public void deleteTail() {
    	// If the list is empty, nothing to delete
        if (head == null) {
            return;
        }

        // If the list has only one node, set head to null
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse the list to find the tail's previous node
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        // Update the previous node's next pointer to null to remove the tail node
        currentNode.next = null;
    }
}