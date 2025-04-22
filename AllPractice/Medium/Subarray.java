package Subarray;

//find subarrays which has the given sum in a one dimensional array
//Example: arr = {1,2,3,4,5} and sum = 9
//Output: {2,3,4} and {4,5}

public class Subarray {
    
    // Time complexity: O(n^2) and Space complexity: O(1)
    public static void calculateArrayOnSumSlidingWindow(int[] arr, int targetSum) {
        int start =0, sum=0;
        for (int j=0;j<arr.length;j++) {
            sum+= arr[j];
            
            while(sum > targetSum && start < j) {
                sum -= arr[start++];
            }
            
            if(targetSum == sum) {
                System.out.print("{");
                for(int k=start;k<=j;k++) {
                 System.out.print(arr[k]);
                 if(k<j)
                    System.out.print(",");
                }
                System.out.println("}");
            }
                
            }
    }

    public static void calculateArrayOnSum(int[] arr,int givenSum) {
        int sizeOfArray = arr.length;

        for(int i=0;i<sizeOfArray;i++) {
            int sum =0;
            for(int j=i;j<sizeOfArray;j++) {
                sum += arr[j];
                if(sum == givenSum) {
                    System.out.print("{");
                    for(int k=i;k<=j;k++) {
                        System.out.print(arr[k]);
                        if(k<j)
                            System.out.print(",");
                    }
                    System.out.println("}");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum =9;
        
    calculateArrayOnSum(arr,sum);
    }
    
}