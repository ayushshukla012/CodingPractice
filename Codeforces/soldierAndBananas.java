import java.util.*; 
public class soldierAndBananas  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int k = input.nextInt();
          int n = input.nextInt();
          int w = input.nextInt();
          int sum = 0;
          int result = 0;
          for (int i = 1; i <= w; i++) {
          	sum += k * i;
          }
          result = sum - n;
          if (result <= 0) {
          	System.out.println(0);
          } else {
          	System.out.println(result);
          }
          input.close();  
     }
}
