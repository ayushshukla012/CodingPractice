
/*
 * Problem Statement: Given an integer array sorted in non-decreasing order, 
 * remove the duplicates in place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same.
 * If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. 
 * It does not matter what you leave beyond the first k elements.
 * Note: Return k after placing the final result in the first k slots of the array.
 */
public class RemoveDuplicate {
    
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3,3,3,3,4,4};

		//Approach-1
//		HashSet<Integer> tempStorage = new HashSet<>();
//		for (int i=0;i<arr.length;i++) {
//			tempStorage.add(arr[i]);
//		}
//		int sizeOfSet = tempStorage.size();
//		System.out.println(sizeOfSet);
//		
//		int index = 0;
//		for(int x: tempStorage) {
//			arr[index] = x;
//			System.out.println(arr[index]);
//			index++;
//		}
		
		//Approach-2 - Two Pointer
		int index = 0;
		for (int j = 1; j< arr.length; j++) {
			if (arr[j] != arr[index]) {
				index++;
				arr[index] = arr[j];
			}
		}
		for (int i =0;i<index+1;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
