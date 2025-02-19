class Solution {
    // Function to display the elements of a linked list in same line
    void printList(Node head) {
         Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
    }
}
