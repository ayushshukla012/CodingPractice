package Arrays;

//Find the number that appears once, and the other numbers twice in the array.
/*
Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */

public class NumberThatAppearOnce {
    
    //Approach-1
    // Linear Search
    // Time Complexity: O(n^2)
    public static int findOnlyOnce(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int num = arr[i];
            int count = 0;
            
            for (int j=0;j<arr.length;j++) {
                if (num == arr[j]) {
                    count++;
                }
            }
            if (count == 1)
                return num;
        }
        return -1;
    }


    //Approach-2
    // Hashing
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int findOnlyOnceHashArray(int[] arr) {
        int arrayLength = arr.length;
        int[] hash = new int[arrayLength];
        
        int maxEle = arr[0];
        for (int i=0;i<arrayLength;i++) {
            maxEle = Math.max(maxEle,arr[i]);
        }
        
        for (int j=0;j<arrayLength;j++){
            hash[arr[j]]++;
        }
        
        for (int k=0;k<maxEle+1;k++) {
            if(hash[k] == 1)
                return k;
        }
        return -1;
    }

    //Approach-3
    // XOR
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findOnlyOnceUsingXor(int[] arr) {
        int appearOnce =arr[0];
        for(int i=1;i<arr.length;i++) {
            appearOnce = appearOnce ^ arr[i];
        }
        return appearOnce;
    }
    
     public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int number = findOnlyOnce(arr);
        System.out.println("findOnlyOnce: " + number);
        
    }
}
