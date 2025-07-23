package TUF_Blind75Sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Problem Statement: Given an array of N integers, 
your task is to find unique triplets that add up to give a sum of zero. 
In short, you need to return an array of all the unique triplets 
[arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is equal to zero.
 */
public class ThreeSum {
    static List<List<Integer>> bruteForceApproach(int[] arr, int len) {
        Set<List<Integer>> localSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for(int k=j+1;k<len;k++) {
                    if(arr[i]+arr[j]+arr[k]==0) {
                        List<Integer> tempList = Arrays.asList(arr[i],arr[j],arr[k]);
                        tempList.sort(null);
                        localSet.add(tempList);
                    }
                }
            }
            
        }
        List<List<Integer>> transferToList = new ArrayList<>(localSet);
        return transferToList;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int len = arr.length;
        List<List<Integer>> listOfListForInteger = bruteForceApproach(arr,len);
        for(List<Integer> outerListElements : listOfListForInteger) {
            System.out.print("[");
            for(Integer innerListElements : outerListElements) {
                System.out.print(innerListElements + " ");
            }
            System.out.println("]");
        }
    }
}
