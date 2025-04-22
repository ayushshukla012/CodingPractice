// 1,2,6,3,1,4
//Output- 4
// Find the second largest element in an array.

import java.util.Arrays;
import java.util.OptionalInt;

class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,1,4,2,4,1,7};
        int largest = arr[0];
        int secondLargest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Try programiz.pro " + secondLargest);

        //Approach-2
        OptionalInt secondLar = Arrays.stream(arr)
                .distinct()  // Remove duplicates
                .boxed()     // Convert int to Integer
                .sorted((a, b) -> b - a)  // Sort in descending order
                .skip(1)  // Skip the first (largest) element
                .mapToInt(Integer::intValue)  // Convert back to int
                .findFirst();  // Get the first element after skipping

        System.out.println(secondLar.isPresent() ? "Second largest: " + secondLar.getAsInt() : "No second largest element found");
    }
}