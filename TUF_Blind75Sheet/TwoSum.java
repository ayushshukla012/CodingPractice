package TUF_Blind75Sheet;

import java.util.Arrays;

/*
Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}. 
 */
public class TwoSum {
    static void naiveBaiseApproach(int[] arr, int N, int target) {
        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                if(arr[i]+arr[j]==target) {
                    System.out.println("YES");
                    System.out.println("Index:"+ i + "&" + j);
                    return;
                }
            }
        }
        System.out.println("No pair found.");
    }

    static void optimizedApproach(int[] arr, int N, int target) {
        Arrays.sort(arr);
        int left=0,right=N-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("True");
                return;
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No");
        
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int N=5;
        int target = 14;

        naiveBaiseApproach(arr,N,target);

        optimizedApproach(arr,N,target);
    }
}
