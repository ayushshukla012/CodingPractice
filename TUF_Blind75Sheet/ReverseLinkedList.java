package TUF_Blind75Sheet;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    static void reverseBruteForce(Node head) {
        Stack<Integer> localStack = new Stack<>();
        Node temp = head;
        while(temp != null) {
            localStack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null) {
            temp.data = localStack.pop();
            temp = temp.next;
        }
        displayList(head);
    }
    static void displayList(Node head) {
        Node temp = head;
        System.out.println("Reverse List:");
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static Node reverseOptimized(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseOptimized(head.next);

        Node front = head.next;
        front.next = head;
        head.next =null;
        return newHead;
    }
    public static void main(String[] args) {
        List<Integer> localList = Arrays.asList(1,2,3,4,5,6);
        Node head = new Node(localList.get(0));
        Node temp = head;
        for(int i =1;i<localList.size();i++) {
            temp.next = new Node(localList.get(i));
            temp = temp.next;
        }
        reverseBruteForce(head);
        displayList(reverseOptimized(head));
    }
}
class Node {
    int data;
    Node next;

    Node(int tempData) {
        this.data = tempData;
    }
}