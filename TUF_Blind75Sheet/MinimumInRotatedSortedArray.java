package TUF_Blind75Sheet;
/*
Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array. 

Pre-requisites: 
    Search in Rotated Sorted Array I,  
    Search in Rotated Sorted Array II,
    Binary Search algorithm
 */
public class MinimumInRotatedSortedArray {
    static void bruteForceApproach(int[] arr, int len) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<len;i++) {
            min = arr[i] < min ? arr[i] : min;
        }
        System.out.println("MinimumInRotatedSortedArray.bruteForceApproach(): " + min);
    }

    static void optimalApproach(int[] arr,int len) {
        int low =0,high=len-1;
        
        int min = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
                low = mid+1;
            } else {
                min=Math.min(min, arr[mid]);
                high = mid-1;
            }
        }
        System.out.println("MinimumInRotatedSortedArray.optimalApproach() : " + min);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int len = arr.length;
        bruteForceApproach(arr,len);
        optimalApproach(arr,len);
    }
}