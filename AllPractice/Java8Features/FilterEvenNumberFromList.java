package Java8Features;
//Write a Java 8 program to filter and print even numbers from a list.

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumberFromList {
    	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    List<Integer> userList = Arrays.asList(2,5,7,4,32,5,6);
          userList.stream()
          .filter(x -> x%2==0)
          .forEach(System.out::println);

	}
}
