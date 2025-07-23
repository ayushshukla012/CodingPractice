package List;

import java.util.ArrayList;
import java.util.List;

/*
 * 
Operation 1: Adding elements to List using add() method
Operation 2: Updating elements in List using set() method
Operation 3: Searching for elements using indexOf(), lastIndexOf methods
Operation 4: Removing elements using remove() method
Operation 5: Accessing Elements in List using get() method
Operation 6: Checking if an element is present in the List using contains() method 
 * 
ArrayList
Vector
Stack
LinkedList
 */
public class CreatingList {
    static void arrayListExample() {
        List<String> localList = new ArrayList<>();
        //add
        localList.add("Hello");
        localList.add("World");
        localList.add("Cheetah");
        System.out.println("After adding: " + localList);

        //set
        localList.set(1, "element");
        System.out.println("After set: " + localList);

        //indexOf
        System.out.println("index of: " + localList.indexOf("element"));

        //remove
        localList.remove(2);
        System.out.println("After removing: " + localList);

        //get
        System.out.println("get index: " + localList.get(1));

        //contains
        System.out.println("contains index: " + localList.contains("element"));


    }
    public static void main(String[] args) {

        //ArrayList- all operations
        arrayListExample();

        
    }
}
