package TUF_Blind75Sheet;
/*
Given an integer array nums, return an array answer such that answer[i] is equal to 
the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class ProductOfArrayExceptSelf {
    static void calculateProductBruteForce(int[] arr, int len) {
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            int tempProd = 1;
            for(int j = 0;j<len;j++) {
                tempProd *= arr[j];
            }
            temp[i] = tempProd /arr[i];
        }
        displayResult(temp);
    }

    static int product(int[] arr, int start, int end) {
        int prod = 1;
        for (int i = start; i < end; i++) {
            prod *= arr[i];
        }
        return prod;
    }

    static void calculateProductBetter(int[] arr, int len) {
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i] = product(arr, 0, i) * product(arr, i+1, len);
        }
        displayResult(temp);
    }

    static void displayResult(int[] arr) {
        System.out.print("[");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int len = arr.length;
        calculateProductBruteForce(arr,len);
        calculateProductBetter(arr,len);
    }
}
