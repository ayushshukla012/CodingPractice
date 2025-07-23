package TUF_Blind75Sheet;
/*
Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) 
which has the largest sum and returns its sum and prints the subarray.
 */
public class KadaneAlgorithm {
    static void bruteForceApproach(int[] arr,int len) {
        
        int max =0;
        for(int i=0;i<len;i++) {
            for(int j =i;j<len;j++) {
                int sum =0;
                for(int k=i;k<=j;k++) {
                    sum+=arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println("bruteForceApproach-Largest sum is: " + max);
    }
    static void betterApproach(int[] arr,int len) {
        int max = 0;
        for(int i=0;i<len;i++) {
            int sum = 0;
            for (int j=i;j<len;j++){
                sum+=arr[j];

                max = Math.max(sum, max);
            }
        }
        System.out.println("betterApproach-Largest sum is : "+ max);
    }

    static void optimalApproach(int[] arr, int len) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<len;i++) {
            sum += arr[i];

            if(sum > max) {
                max = sum;
            }
            if(sum < 0)
                sum =0;
        }
        System.out.println("KadaneAlgorithm.optimalApproach() " + max);
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int len = arr.length;

        bruteForceApproach(arr,len);
        betterApproach(arr,len);
        optimalApproach(arr,len);
    }
}
