package LinkedList;

import java.util.Stack;

/*
 * Given the head of a singly linked list, write a program to reverse the linked list, and return the head pointer to the reversed list.
 */
// Input Format: 0->1->2->3->4
// Result: 4->3->2->1->0

class Node {
    int data;
    Node next;
    
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseALinkedList {

    
    public static Node reverseAList(Node head) {
        Node temp = head;
        Stack<Integer> data = new Stack<>();
        while(temp != null) {
            data.push(temp.data);
            temp = temp.next;
        }
        temp=head;
        
        while(temp!= null) {
            temp.data = data.pop();
            temp = temp.next;
        }
        return head;
    }
    public static void printTheList(Node head) {
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null)
                System.out.print("->");
            temp = temp.next;    
        }
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
    	
    	head = reverseAList(head);
    	
    	printTheList(head);
    	

	}
}
