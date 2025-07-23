package Java8.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Merge two sorted linked list. */
class Node {
    int data;
    Node next;

    Node(int dataM) {
        this.data = dataM;
    }
}
public class MergeTwoSortedLL {
    static Node sortAndCreateLL(ArrayList<Integer> localArrayList) {
        Node localLL = new Node(-1);
        Node temp = localLL;

        Collections.sort(localArrayList);
        // for(int each : localArrayList) {
        //     if()
        // }

        for(int each : localArrayList) {
            temp.next = new Node(each);
            temp = temp.next;
        }

        return localLL.next;
    }
    static void mergeTwoSortedLL(Node firstSortedLL, Node secondSortedLL) {
        ArrayList<Integer> storeLLData = new ArrayList<>();
        Node temp1 = firstSortedLL;
        Node temp2 = secondSortedLL;

        while(temp1 != null) {
            storeLLData.add(temp1.data);
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            storeLLData.add(temp2.data);
            temp2 = temp2.next;
        }

        Node localHead = sortAndCreateLL(storeLLData);
        
        printLL(localHead);
    }

    static void printLL(Node finalLLHead) {
        Node temp = finalLLHead;

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        //List-1
        List<Integer> localList = Arrays.asList(1,2,3,4,5);

        // Node head = new Node(localList.get(0));
        // head.next = new Node(localList.get(1));
        // head.next.next = new Node(localList.get(2));
        // head.next.next.next = new Node(localList.get(3));
        Node head = new Node(localList.get(0));
        Node temp = head;
        for(int i=1;i<localList.size();i++){
            temp.next = new Node(localList.get(i));
            temp = temp.next;
        }

        //List-2
        List<Integer> localList1 = Arrays.asList(5,6,7,8,9);
        Node head1 = new Node(1);
        Node temp1 = head1;
        for(int ll : localList1){
            temp1.next = new Node(ll);
            temp1 = temp1.next;
        }

        mergeTwoSortedLL(head,head1);
    }
}
