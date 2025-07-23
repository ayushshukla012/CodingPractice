package TUF_Blind75Sheet;

import java.util.Arrays;
import java.util.HashSet;

/*
Problem Statement: Given an integer array nums, 
return true if any value appears at least twice in the array, 
and return false if every element is distinct.
 */
public class ContainDuplicate {
    static void naiveBaiseApproach(int[] num, int len) {
         for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++) {
                if(num[i]==num[j]) {
                    System.out.println("Duplicate found : "+ num[j] + " at index: " + j);
                    return;
                }
            }
        }
        System.out.println("No duplicate found.");
    }

    static void optimizedApproach(int[] arr) {
        HashSet<Integer> localSet = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            localSet.add(arr[i]);
        }
        if(localSet.size() < arr.length)
            System.out.println("Duplicate found.");
        else
            System.out.println("NO DUPLICATE found");
    }

    static void anotherApproach(int[] arr, int len) {
        Arrays.sort(arr);
        for(int i=1;i<len;i++) {
            if(arr[i]==arr[i-1]){
                System.out.println("Duplicate found at: "+i);
                return;
            }
            System.out.println("No duplicate found.");
        }
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,1};
        int len = num.length;
       
        naiveBaiseApproach(num,len);
        anotherApproach(num,len);
        optimizedApproach(num);
    }
}
