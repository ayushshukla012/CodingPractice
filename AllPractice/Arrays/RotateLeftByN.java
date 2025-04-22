
//Rotate the array by N.

public class RotateLeftByN {
	public static void main(String[] args) {
		int N = 5;
		Integer[] arr = {1,2,3,4,5,6,7,8,9};
		//Output 6,7,8,9,1,2,3,4,5 left
		// Output 5,6,7,8,9,1,2,3,4 right
		
		//Approach1
		// left
		//5,4,3,2,1,6,7,8,9
		//5,4,3,2,1,9,8,7,6
		//6,7,8,9,1,2,3,4,5
		
		//right
		//1,2,3,4,9,8,7,6,5
		//4,3,2,1,9,8,7,6,5
		//5,6,7,8,9,1,2,3,4
		int size = arr.length;
		int temp = Integer.MAX_VALUE;
		int j = N-1;
		for(int i=0 ; i<N; i++) {
			if(i<j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j--;
		}
		int k = size-1;
		for(int i=N ; i<size; i++) {
			if(i<k) {
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
			k--;
		}
		int l = size-1;
		for(int i=0 ; i<size; i++) {
			if(i<k) {
				temp = arr[i];
				arr[i] = arr[l];
				arr[l] = temp;
			}
			l--;
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		//Approach-2
		
	}
}