public class Pattern3 {
    public static void main(String[] args) {
        for (Integer i=0;i<5;i++){
            for(Integer j=5;j>i;j--) {
                System.out.print(" ");
            }
            for (Integer k=1;k<=(i*2+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
