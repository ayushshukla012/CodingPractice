public class Pattern6 {
    public static void main(String[] args) {
        int n =6;
        for(Integer i=1;i<n;i++){
            for(Integer j=1;j<=i;j++){
                System.out.print(j);
            }
            for(Integer k=(n-1)*2;k>i*2;k--) {
                System.out.print(" ");
            }
            for(Integer l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
