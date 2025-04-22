package LinkedList;

/*
 * Given the head of a linked list and an integer value, find out whether the integer is present in the linked list or not.
 * Return true if it is present, or else return false.
Input Format: 0->1->2, val = 2
Result True
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

public class SearchInLL {
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        while (temp != null) {
           
            if (temp.data == desiredElement)
                return 1; 
            temp = temp.next;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3; 
        System.out.print(checkifPresent(head, val));
    }
}
