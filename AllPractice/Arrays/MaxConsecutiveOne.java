package Arrays;

//Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
//Example 1:
//Input Format: arr[] = {1, 0, 1, 1, 0, 1}
//Result: 2
//Explanation: In the given array, maximum consecutive 1's are 2. So, 2 is the answer.

//Example 2:
//Input Format: arr[] = {1, 1, 0, 1, 1, 1}
//Result: 3
//Explanation: In the given array, maximum consecutive 1's are 3. So, 3 is the answer.

public class MaxConsecutiveOne {
    
    //Approach-1
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int maxConsecutiveOne(int[] arr) {
        int maxOne = 0;
        int numberToFind = 1;
        int counter = 0;
        for (int i =0;i<arr.length;i++) {
            if(arr[i]==numberToFind) {
                counter++;
                if(counter > maxOne) {
                maxOne = counter;
                }
            } else {
                counter = 0;
            }
            //maxOne = Math.max(maxOne, counter);
        }
        return maxOne;
    }

    
     public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1} ;
        int number = maxConsecutiveOne(arr);
        System.out.println("Maximum consecutive One: " + number);
        
    }
}
