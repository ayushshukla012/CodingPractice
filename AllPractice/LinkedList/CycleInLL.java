package LinkedList;
/*
 * * Given the head of a linked list, check if the linked list has a cycle in it or not.
 */

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleInLL {
    public static boolean findTheCircle(Node newNode) {
        Node slow = newNode;
        Node fast = newNode;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next =second;
        
        System.out.println("Is Loop Present: "+findTheCircle(head));
        
	}
}
