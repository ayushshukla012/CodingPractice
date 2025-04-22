public class Pattern5 {
    public static void main(String[] args) {
        for(Integer i=0;i<5;i++){
            for (Integer j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(Integer k=1;k<=(i*2+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(Integer i=4;i>=0;i--){
            for (Integer j=5;j>i;j--){
                System.out.print(" ");
            }
            for(Integer k=(i*2+1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
