

/*
 *Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. 
 *If the array is sorted then return True, Else return False.
 *Note: Two consecutive equal values are considered to be sorted.
 */

 public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found an out-of-order pair, so array is not sorted
            }
        }
        return true; // No out-of-order pairs found, so array is sorted
    }
}
