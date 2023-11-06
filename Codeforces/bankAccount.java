import java.util.*; 
public class bankAccount  
{ 
    public static void main(String[] args)  
    {  
          Scanner scanner=new Scanner(System.in); 
                  int n = scanner.nextInt();

        if (n >= 0) {
            // If n is non-negative, we keep it as is
            System.out.println(n);
        } else {
            // If n is negative, we have two options: removing the last digit or the digit before the last
            int lastDigitRemoved = n / 10;
            int digitBeforeLastRemoved = (n / 100) * 10 + n % 10;

            // Choose the option that results in a larger bank account balance
            int result = Math.max(lastDigitRemoved, digitBeforeLastRemoved);

            System.out.println(result);
        }
          scanner.close();  
     }
}

