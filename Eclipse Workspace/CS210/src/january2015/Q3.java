package january2015;

public class Q3 {

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

class SingleEndedDoublyLinkedList {
    Node head;

    // Method to delete every third link in a single-ended doubly-linked list
    public void deleteEveryThirdLink() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;

            // Check if the current link is the third one
            if (count % 3 == 0) {
                Node prevNode = current.prev;
                Node nextNode = current.next;

                // Update links to skip the current node
                if (prevNode != null) {
                    prevNode.next = nextNode;
                } else {
                    // If current node is the head, update head
                    head = nextNode;
                }

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }

                // Move to the next node (skip the deleted one)
                current = nextNode;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
    }
}