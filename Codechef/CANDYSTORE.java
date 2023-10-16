/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    int[] result_arr = new int[testCases];
	    int x = 0, y = 0;
	    for (int i = 0; i < testCases; i++) {
	        x = sc.nextInt();
	        y = sc.nextInt();
	        if (x >= y) {
	            result_arr [i] = y;
	        } else {
	            result_arr[i] = 2 * y - x;
	        }
	        x = 0;
	        y = 0;
	    }
	     for (int i = 0; i < testCases; i++) {
	         System.out.println(result_arr[i]);
	     }
		// your code goes here
	}
}
