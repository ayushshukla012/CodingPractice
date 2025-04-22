package LinkedList;

class Node {
    int data; //property
    Node newNode; // reference
    
    Node(int newData, Node newN) { 
        this.data = newData; //Initialize data
        this.newNode = newN; // Reference to next node
    }
    
    Node(int newData) {
        this.data = newData;
        this.newNode = null; //Used for last node
    }
    
}

public class BasicLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        Node n = new Node(arr[3]);
        Node y = n;
        System.out.println("Node data: " + y.data);
        
        
        n.data = 23;
        System.out.println("Node data: " + y.data);
       
    }
}
