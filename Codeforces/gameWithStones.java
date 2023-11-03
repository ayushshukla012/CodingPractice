import java.util.*; 
public class gameWithStones  
{ 
    public static void main(String[] args)  
    {  
          Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int totalIntersectionPoints = n * m;

        if (totalIntersectionPoints % 2 == 0) {
            System.out.println("Akshat");
        } else {
            System.out.println("Malvika");
        }
         scanner.close();  
     }
}
