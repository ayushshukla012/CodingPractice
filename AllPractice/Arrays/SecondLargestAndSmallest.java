

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[]arr = {6,4,8,3,1,2,7,9};
        //Approach-1
        // if(arr.length<2){
        //     System.out.println("Second largest: "+ -1);
        //     System.out.println("Second smallest: "+ -1);
        // } else{
        //     Arrays.sort(arr);
        //     System.out.println("Second largest: "+arr[arr.length-2]);
        //     System.out.println("Second smallest: "+arr[1]);
        // }

        //Approach-2
        int small = Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        if(arr.length<2){
            System.out.println("Second largest: "+ -1);
            System.out.println("Second smallest: "+ -1);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondSmallest = small;
                small = arr[i];

            } else if(arr[i]<secondSmallest && arr[i]!=small){
                secondSmallest = arr[i];
            }
            if(arr[i]>large){
                secondLargest = large;
                large = arr[i];
            } else if(arr[i]>secondLargest && arr[i]!=large){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest: "+secondLargest);
        System.out.println("Second smallest: "+secondSmallest);

    }
}
