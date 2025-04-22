public class LargestInArray {
    public static void main(String[] args) {
        int[] arr ={4,5,2,7,4,1,9,3,8};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element in the array is: "+max);
    }
}
