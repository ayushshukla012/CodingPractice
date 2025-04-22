package Arrays;
//Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
//Find the number(between 1 to N), that is not present in the given array.

import java.util.Arrays;

/*Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.
 */
public class FindMissingNumber {
    //Approach-1
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // This approach assumes that the array is sorted in ascending order.
    public static int findMissingNumber(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1;
            }
        }
        return -1;
    }
    
    //Approach-2
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // This approach does not assume that the array is sorted.
    // It uses the formula for the sum of the first N natural numbers to find the missing number.
    public static int findMissingNumberUsingSum(int[] arr) {
        int n = arr.length + 1; // Since the array has N-1 elements
        int totalSum = (n * (n + 1)) / 2; // Sum of first N natural numbers
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum; 
    }

    //Another Approach-3
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // This approach uses a frequency array to find the missing number.
    public static int findMissingNumber(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("min"+min);
        System.out.println("max"+max);
        
        // Create a frequency array from min to max
        int[] uniqueNum = new int[max + 1];
        
        for (int i = 0; i < arr.length; i++) {
            uniqueNum[arr[i]]++;
        }

        for (int i = min; i <= max; i++) {
            if (uniqueNum[i] == 0) {
                return i;
            }
        }
            return -1;
    }

     public static void main(String[] args) {
        int[] arr = {4,5,7,8,9};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number is: " + (missingNumber != -1 ? missingNumber : "none"));
    }
}
