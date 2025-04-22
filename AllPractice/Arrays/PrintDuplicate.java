//Given an array print the duplicate elements present in the array

import java.util.HashSet;

public class PrintDuplicate {
	public static void main(String[] args) {
		Integer[] arr = {3,4,1,2,6,7,9,4,5,7,2,9};
		//2,4,7,9
		
		//Approach-1
		System.out.println("Approach - 1");
		Integer size = arr.length;
		HashSet<Integer> duplicateElement = new HashSet<Integer>();
		for (int i=0;i<size;i++) {
			for (int j=size-1;j>i;j--) {
				if(arr[i] == arr[j]) {
					duplicateElement.add(arr[i]);
				}
			}
		}
		for(int x : duplicateElement) {
			System.out.println(x);
		}
		
		
		//Approach-2
		System.out.println("Approach - 2");
		HashSet<Integer> findDupli = new HashSet<Integer>();
		HashSet<Integer> dupliElement = new HashSet<Integer>();
		
		for (int x : arr) {
			if(!findDupli.add(x)) {
				dupliElement.add(x);
			}
		}
		for(int y:dupliElement) {
			System.out.println(y);
		}
	}
}