
public class KadaneAlgorithm {

    //Approach-1 - Brute Force
    // Time Complexity: O(n^3)
    // Space Complexity: O(1)
    // This approach is not efficient for large arrays.
    public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        int startIndex = -1, endIndex = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (sum > maxi) {
                    maxi = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        if (startIndex != -1 && endIndex != -1) {
            for (int q = startIndex; q <= endIndex; q++) {
                System.out.print(arr[q] + ", ");
            }
        }
        System.out.println();
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("Maximum Subarray Sum: " + maxSum);

    }

    //Approach-2
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    class Approach2 {

        public static int calculateMaxSum(int[] arr, int len) {
            int maxSum = Integer.MIN_VALUE;
            int startIndex = -1, endIndex = -1;
            for (int i = 0; i < len; i++) {
                int sum = 0;
                for (int j = i; j < len; j++) {
                    sum += arr[j];

                    if (sum > maxSum) {
                        maxSum = sum;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
            if (startIndex != -1 || endIndex != -1) {
                System.out.println("startIndex: " + startIndex + " ,endIndex: " + endIndex);
            }

            return maxSum;
        }

        public static void main(String[] args) throws java.lang.Exception {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int len = arr.length;
            System.out.println("MaxSum: " + calculateMaxSum(arr, len));
        }
    }

    //Approach-3 - Kadane's Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    class Approach3 {
        public static int maxSubArray(int[] arr) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < 0) {
                    currentSum = 0;
                }
            }
            return maxSum;
        }
        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int maxSum = maxSubArray(arr);
            System.out.println("Maximum Subarray Sum: " + maxSum);
        }
    }

}
