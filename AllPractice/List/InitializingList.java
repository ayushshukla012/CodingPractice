package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/*
Double Braces Initialization
Using Arrays.asList()
Using Collections Class Methods
Using Java 8 Stream
Using Java 9 List.of()

For DS:
    ArrayList
    Vector
    Stack
    LinkedList
 */
public class InitializingList {
    static void doubleBraces() {
        List<Integer> localArrayList = new ArrayList<>(){{
            add(2);
            add(2);
            add(2);
            add(2);
        }};

        System.out.println("ArrayList Using double braces: "+ localArrayList);
        localArrayList.add(3);
        System.out.println("ArrayList Using double braces after: "+ localArrayList);

        List<Integer> localVector = new Vector<>(){{
            add(3);
            add(3);
            add(3);
            add(3);
        }};

        System.out.println("Vector Using double braces: "+ localVector);

        List<Integer> localStack = new Stack<>(){{
            add(5);
            add(5);
            add(5);
            add(5);
        }};

        System.out.println("Stack Using double braces: "+ localStack);

        List<Integer> localLinkedList = new LinkedList<>(){{
            add(4);
            add(4);
            add(4);
            add(4);
        }};

        System.out.println("LinkedList Using double braces: "+ localLinkedList);
    }

    static void asListImmutable() {
        List<Integer> localIntList = Arrays.asList(1,2,4,5,6,7);

        System.out.println("Local Integer list: " + localIntList);

        //Below will give error
        // localIntList.add(2,3);
        // System.out.println("Local Integer list after: " + localIntList);
    }

    static void asListMutable(){
        List<Integer> localMutableList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Local Mutable Integer list: " + localMutableList);

        localMutableList.add(3);
        System.out.println("Local Mutable list: " + localMutableList);

    }

    static void collectionsClass() {
        List<Integer> localCollectionList = new ArrayList<>();

        Collections.addAll(localCollectionList, 1,2,3,4);

        System.out.println("Local COllection list: " + localCollectionList);
    }


    public static void main(String[] args) {
        //Double braces -- mutable
        doubleBraces();

        //Arrays.asList --Immutable
        asListImmutable();

        asListMutable();

        //Collections-class
        collectionsClass();



    }
}
