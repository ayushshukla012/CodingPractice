public class Pattern7 {
    public static void main(String[] args) {
        int n = 4;
        int size = 7;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int num = n - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // for(Integer i=4;i>0;i--) {
        //     for(Integer k=4;k>i;k--){
        //         if(i==4){
        //             continue;
        //         }
        //         System.out.print(k);
        //     }
        //     for (Integer j=0;j<(i*2-1);j++) {
        //         System.out.print(i);
        //     }
        //     for(Integer k=i;k<=4;k++){
        //         if(i==1){
        //             continue;
        //         }
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }
    }
}
