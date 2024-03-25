public class RemoveDupLinked {

    static class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to remove duplicate elements from a sorted linked list
    static void removeDuplicates(LinkedListNode head) {
        LinkedListNode current = head;
        
        // If the list is empty or has only one element, there are no duplicates
        if (head == null || head.next == null)
            return;

        // Traverse the list
        while (current != null) {
            LinkedListNode runner = current;
            
            // Check for duplicates of current node
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next; // Remove duplicate
                } else {
                    runner = runner.next;
                }
            }
            current = current.next; // Move to the next node
        }
    }

    // Utility method to print the linked list
    static void printLinkedList(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(2);
        head.next.next.next = new LinkedListNode(3);
        head.next.next.next.next = new LinkedListNode(4);
        head.next.next.next.next.next = new LinkedListNode(4);
        head.next.next.next.next.next.next = new LinkedListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        removeDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printLinkedList(head);
    }
}
