import java.util.*; 
public class gameWithStones  
{ 
    public static void main(String[] args)  
    {  
          Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int totalIntersectionPoints = Math.min(n, m);

        if (totalIntersectionPoints % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
         scanner.close();  
     }
}

