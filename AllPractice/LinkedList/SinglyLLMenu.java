package LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int nData, Node next) {
        this.data = nData;
        this.next = next;
    }
    
    Node(int nData) {
        this.data = nData;
        this.next = null;
    }
    
}

class LocalLinkedList {
    Node head;
    
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    public void deleteFromList(int value) {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        if(head.data == value) {
            head = head.next;
            System.out.println("Value deleted");
            return;
        }
        
        Node temp = head;
        while(temp.next != null && temp.data != value) {
            temp = temp.next;
        }
        
        if(temp.next == null) {
            System.out.println("Number not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Number deleted");
        }
            
    }
    
    public void displayCompleteList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
    
    public void searchTheList(int value) {
        Node temp = head;
        int pos = 1;
        while(temp != null) {
            if(temp.data == value) {
                System.out.println("Value found at : " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Value not found.");
    }
    
}

public class SinglyLLMenu {
    	public static void main (String[] args) throws java.lang.Exception
	{
		LocalLinkedList list = new LocalLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice, value;
		while(true){
    		System.out.println("////=====Linked List Menu====////");
    		System.out.println("1.Insert at beginning");
    		System.out.println("2.Insert at end");
    		System.out.println("3.Delete by value");
    		System.out.println("4.Display the list");
    		System.out.println("5.Search a value");
    		System.out.println("6.exit");
    		choice = sc.nextInt();
    		
    		switch(choice) {
    		    case 1:
    		        System.out.println("Enter the number to be inserted at beginning");
    		        value = sc.nextInt();
    		        list.insertAtBeginning(value);
    		        break;
    		    case 2:
    		        System.out.println("Enter the number to be inserted at end.");
    		        value = sc.nextInt();
    		        list.insertAtEnd(value);
    		        break;
    		    case 3:
    		        System.out.println("Enter the value to be deleted");
    		        value=sc.nextInt();
    		        list.deleteFromList(value);
    		        break;
    		    case 4:
    		        System.out.println("Displaying the list");
    		        list.displayCompleteList();
    		        break;
    		    case 5:
    		        System.out.println("Enter value to be searched");
    		        value = sc.nextInt();
    		        list.searchTheList(value);
    		        break;
    		    case 6:
    		        System.out.println("Exiting...");
    		        sc.close();
    		        return;
    		    default:
    		        System.out.println("Enter valid choice as per the given Menu. Try Again!");
    		}
		}

	}
}
