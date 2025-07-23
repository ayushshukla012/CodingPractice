package Java8.Lambda;

// Sort a list of String in reverse order using lambda.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("appple","maaango","baanannana","Apuytrewple");
        System.out.println("Before sorting: " + stringList);

        //sort
        stringList.sort((s1,s2)->s1.compareTo(s2));
        System.out.println("After sorting: "+stringList);

        //reverse
        stringList.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("After reverse sorting: "+stringList);

        //sort-with Ignorecasing
        stringList.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        System.out.println("After sorting: "+stringList);

        //Compare on length of string
        stringList.sort(Comparator.comparingInt(String::length));
        System.out.println("After comparing on length: " + stringList);

    }
}