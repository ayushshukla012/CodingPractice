package Java8Features;

import java.util.Arrays;
import java.util.List;

// Write a Java 8 program to map integers to their squares and print results.

public class SquareGivenNumberAndPrint {
    	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    List<Integer> square = Arrays.asList(1,2,3,4);
	    square.stream()
	    .map(x -> x*x)
	    .forEach(System.out::println);
	}
}
