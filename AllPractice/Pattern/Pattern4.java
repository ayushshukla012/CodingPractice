public class Pattern4 {
    public static void main(String[] args) {
        for (Integer i=5;i>=0;i--){
            for(Integer j=5;j>i;j--) {
                System.out.print(" ");
            }
            for (Integer k=(i*2+1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
