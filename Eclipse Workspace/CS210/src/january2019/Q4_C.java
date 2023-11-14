package january2019;

public class Q4_C {
    public static void main(String[] args) {
    	SinglyLinkedList list = new SinglyLinkedList();
    	
        // Adding nodes to the list
    	Node current = list.head;
    	for(int i=1; i<=10; i++) {
    		Node newNode = new Node(i);
            if (list.head == null) {
            	list.head = newNode;
            } else {
                Node temp = list.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
    	}

        System.out.println("Original List:");
        list.printList();

        // Delete every third node
        list.deleteEveryThirdNode();

        System.out.println("List after deleting every third node:");
        list.printList();
    }

}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;
    
    public SinglyLinkedList() {
    	head = null;
    }    

    // Method to delete every third node in the linked list
    public void deleteEveryThirdNode() {
        if (head == null || head.next == null || head.next.next == null) {
            // If the list is empty or has fewer than three nodes, no deletion is needed
            return;
        }

        Node currentNode = head;
        Node previousNode = null;
        int count = 1;

        while (currentNode != null) {
            if (count == 3) {
                // Delete the current node
                previousNode.next = currentNode.next;
                count = 1;  // Reset the count after deletion
            } else {
                count++;
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    
    // Method to print the linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}