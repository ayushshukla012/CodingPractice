package LinkedList;

/*
 Given the head of a linked list of integers, determine the middle node of the linked list. However, if the linked list has an even number of nodes, return the second middle node.
 Example 1:
                Input: LL: 1  2  3  4  5 
                Output: 3
 Example 2:
                Input: LL: 1  2  3  4  5  6
                Output: 4
 */

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLL {
    public static int findTheMiddle(Node head) {
        if (head == null) {
            System.out.println("List is null");
            return -1;
        }
        Node temp = head;
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr = {1,2,3,4,5};
        
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length;i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        int data = findTheMiddle(head);
        System.out.println("Middle: " + data);
	}
}
