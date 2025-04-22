package LinkedList;

/*
 * Given the head of a linked list, print the length of the linked list.
Input Format: 0->1->2
Result: 3
 */

class Node {
    int data;
    Node next;
    
    Node(int nData, Node nNext) {
        this.data = nData;
        this.next = nNext;
    }
    
    Node(int nData) {
        this.data = nData;
        this.next = null;
    }
}

 public class LengthOfLL {
    public static int calculateNodeLength(Node head) {
        int count = 0;
        while(head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] localArray = {1,2,3,4,5};
	    
	    Node head = new Node(localArray[0]);
	    head.next = new Node(localArray[1]);
	    head.next.next = new Node(localArray[2]);
	    head.next.next.next = new Node(localArray[3]);
	    head.next.next.next.next = new Node(localArray[4]);
	    
	    int lengthOfNodes = calculateNodeLength(head);
	    
	    System.out.println("Length of Nodes: " + lengthOfNodes);
		// your code goes here

	}
}
