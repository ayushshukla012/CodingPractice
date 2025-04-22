package Medium;

public class DetectLoopAndRemove {
    public static boolean isLoopPresent(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
                return true;
        }
        return false;
        
    }
    
    public static void detectAndRemoveCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                System.out.println("Loop found initially");
                break;
            }
        }
        if(slow != fast){
            System.out.println("No loop found");
            return;
        }
            
        slow = head;
        while(slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{

		Node head =  new Node(0);
		Node second =  new Node(1);
		Node third =  new Node(2);
		Node fourth =  new Node(3);
		Node fifth =  new Node(4);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		
		detectAndRemoveCycle(head);
		
		if (isLoopPresent(head)) {
		    System.out.println("Loop Still Detected");
		} else {
		    System.out.println("No Loop In End.");
		}
	}
}
class Node {
    int data;
    Node next;
    
    Node(int nData) {
        this.data = nData;
        this.next = null;
    }
    
    Node(int nData, Node nNext) {
        this.data = nData;
        this.next = nNext;
    }
}
