/*
 * Move all Zeros to the end of the array
 * 
 * In this article we will learn how to solve the most asked coding interview
 * problem: "Move all Zeros to the end of the array"
 * 
 * Problem Statement: You are given an array of integers, your task is to move
 * all the zeros in the array to the end of the array and move non-negative
 * integers to the front by maintaining their order.
 * 
 * Example 1:
 * Input:
 * 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
 * Output:
 * 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
 * Explanation:
 * All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 * 
 * Example 2:
 * Input:
 *  1,2,0,1,0,4,0
 *  Output:
 *  1,2,1,4,0,0,0
 *  Explanation:
 *  All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */

public class MoveZeroToEnd {
	public static void main(String[] args) {
		Integer[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
		
		//Aproach-1
		for (int i =0;i<arr.length;i++) {
			if(arr[i] == 0) {
				for (int j =i;j<arr.length-1;j++) {
					arr[j] = arr[j+1];
				}
				arr[arr.length-1] = 0;
			}
		}
		for (int x :arr) {
			System.out.print(x + " ");
		}


		System.out.println("Approach-2: ");
		//Approach-2
		int j =0;
		for(int i =0;i<arr.length;i++){
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for (int x :arr) {
			System.out.print(x + " ");
		}
	}
}