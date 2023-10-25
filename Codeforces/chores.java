import java.util.*;

public class chores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] chores = new int[n];
        for (int i = 0; i < n; i++) {
            chores[i] = sc.nextInt();
        }
        
        Arrays.sort(chores);
        
        int low = chores[0];
        int high = chores[n - 1];
        
        while (low < high) {
            int x = (low + high + 1) / 2;
            int countA = 0;
            int countB = 0;
            
            for (int chore : chores) {
                if (chore <= x) {
                    countA++;
                } else {
                    countB++;
                }
            }
            
            if (countA >= a && countB >= b) {
                low = x;
            } else {
                high = x - 1;
            }
        }
        
        System.out.println(low);
        sc.close();
    }
}

