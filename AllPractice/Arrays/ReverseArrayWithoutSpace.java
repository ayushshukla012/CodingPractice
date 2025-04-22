//Reverse an array without using extra space.
public class ReverseArrayWithoutSpace {
    //Brute Force Approach
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6};
       int k =2;
       int n=arr.length;
       int[] temp = new int[k];
       for(int i = 0; i<k; i++) {
           temp[i]=arr[i];
       }
       for(int i=k;i<n;i++){
           arr[i-k] = arr[i];
       }
       for(int i=n-k;i<n;i++) {
           arr[i] = temp[i-(n-k)];
       }
       for(int i=0;i<n;i++){
           System.out.print(" " + arr[i]);
       }
    }

    //Best Approach
    private class BetterApproach {
        static void reverse(int from, int to, int[] arr) {
            while(from <= to) {
                int temp = arr[from];
                arr[from]=arr[to];
                arr[to]=temp;
                from++;
                to--;
            }
        }
        public static void main(String[] args) {
           int arr[] = {1,2,3,4,5,6};
           int k =2;
           int n=arr.length;
            reverse(0,k-1,arr);
            reverse(k,n-1,arr);
            reverse(0,n-1,arr);
           for(int i=0;i<n;i++){
               System.out.print(" " + arr[i]);
           }
        }
    }
}
