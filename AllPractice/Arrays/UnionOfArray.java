package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
Example 1:
    Input:
        n = 5,m = 5.
        arr1[] = {1,2,3,4,5}  
        arr2[] = {2,3,4,4,5}
    Output:
        {1,2,3,4,5}

    Explanation: 
        Common Elements in arr1 and arr2  are:  2,3,4,5
        Distnict Elements in arr1 are : 1
        Distnict Elemennts in arr2 are : No distinct elements.
        Union of arr1 and arr2 is {1,2,3,4,5} 

Example 2:
    Input:
        n = 10,m = 7.
        arr1[] = {1,2,3,4,5,6,7,8,9,10}
        arr2[] = {2,3,4,4,5,11,12}
    Output: 
        {1,2,3,4,5,6,7,8,9,10,11,12}
    Explanation: 
        Common Elements in arr1 and arr2  are:  2,3,4,5
        Distnict Elements in arr1 are : 1,6,7,8,9,10
        Distnict Elemennts in arr2 are : 11,12
        Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12} 
 */
public class UnionOfArray {
    
    //Approach-1
    public static List<Integer> unionOfTwoArrayUsingHashSet(int[] arr1, int[] arr2) {
            Set<Integer> unionSet = new HashSet<>();
            
            for (int ele : arr1) {
                unionSet.add(ele);
            }
            for (int ele : arr2) {
                unionSet.add(ele);
            }
        return new ArrayList<>(unionSet);
    }
    
     public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        List<Integer> union = unionOfTwoArrayUsingHashSet(arr1, arr2);
        System.out.println("findOnlyOnce: " + union);
        
    }
}
