public class Pattern1 {
    public static void main(String[] args) {
        for (Integer i=0;i<=5;i++){
            for(Integer j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
