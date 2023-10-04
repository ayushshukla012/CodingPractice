import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SevenRings
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    String[] result_arr = new String[testCases];
	    int x = 0, y = 0;
	    int sum = 0;
	    for (int i = 0; i < testCases; i++) {
	        x = sc.nextInt();
	        y = sc.nextInt();
	        sum = x * y;
	        result_arr[i] = (sum >= 10000 && sum <= 99999) ? "YES" : "NO";
	        sum = 0;
		}
	     for (int i = 0; i < testCases; i++) {
	         System.out.println(result_arr[i]);
	     }
	}
}
