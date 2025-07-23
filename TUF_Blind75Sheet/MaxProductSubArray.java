package TUF_Blind75Sheet;
/*
Problem Statement: Given an array that contains both negative and positive integers, 
                    find the maximum product subarray.
 */
public class MaxProductSubArray {
    static void bruteForceApproach(int[] arr,int len) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<len;i++) {
            int prod = 1;
            for (int j =i;j<len;j++) {
                prod *= arr[j];

                max = Math.max(max,prod);
            }
        }
        System.out.println("Max product: " + max);
    }

    static void betterApproach(int[] arr,int len) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<len-1;i++) {
            int prod = arr[i];
            for(int j=i+1;j<len;j++) {
                max = Math.max(prod,max);
                prod *= arr[j];
            }
            max = Math.max(prod,max);
        }
        System.out.println("Maximum product: " + max);
    }

    static void optimalApproach(int[] arr, int len) {
        int max =0;
        for(int i=0;i<len-1;i++) {
            for(int j =i+1;j<len;j++) {
                int prod = 1;
                for(int k=i;k<=j;k++) {
                    prod *= arr[k];
                }
                max = Math.max(prod, max);
            }
        }
        System.out.println("Maximum product: " + max);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        int len = arr.length;

        bruteForceApproach(arr,len);
        betterApproach(arr,len);
        optimalApproach(arr,len);
    }
}
