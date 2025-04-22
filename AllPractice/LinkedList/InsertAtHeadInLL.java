package LinkedList;

import java.util.Arrays;
import java.util.List;

/*Given a linked list and an integer value val, insert a new node with that value at the beginning 
    (before the head) of the list and return the updated linked list. 
Example:
Input Format: 0->1->2, val = 5
Result: 5->0->1->2
*/
class Node {
    int data;
    Node next;
    
    Node(int newData,Node nextNode) {
        this.data = newData;
        this.next = nextNode;
    }
    
    Node(int newData) {
        this.data = newData;
        this.next = null;
    }
}

public class InsertAtHeadInLL {
    public static void printTheList(Node head){
        while(head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
    
    public static Node insertAtHead(Node head) {
        Node newHead = new Node(5,head);
        return newHead;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		List<Integer> localList = Arrays.asList(1,2,3,4);
		
		Node head = new Node(localList.get(0));
		head.next = new Node(localList.get(1));
		head.next.next = new Node(localList.get(2));
		head.next.next.next = new Node(localList.get(3));
		
		head = insertAtHead(head);
		
		printTheList(head);
	}
}
