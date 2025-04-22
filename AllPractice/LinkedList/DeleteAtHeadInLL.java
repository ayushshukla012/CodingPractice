package LinkedList;

import java.util.Arrays;
import java.util.List;

/*
 * Given a linked list, delete the tail of the linked list and print the updated linked list.
 * 
Examples:
Input Format: 0->1->2
Result: 0->1
 */

 class Node{
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

public class DeleteAtHeadInLL {
        public static Node deleteAtEnd(Node head) {
        if(head == null || head.next == null)
            return null;
        
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        
        temp.next = null;
        
        return head;
    }
    
    public static void printLinkedList(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        List<Integer> localList = Arrays.asList(1,2,3,4);
        
        Node head = new Node(localList.get(0));
        head.next = new Node(localList.get(1));
        head.next.next = new Node(localList.get(2));
        head.next.next.next = new Node(localList.get(3));
        
        head = deleteAtEnd(head);
        
        printLinkedList(head);
    }
}
