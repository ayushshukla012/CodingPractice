import java.util.*; 
public class watermelon  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          long a=input.nextInt();
          if ((a % 2 == 0) & (a > 2)) { 
          	System.out.println("YES");
          } else {
          	System.out.println("NO");
          }
          input.close();  
     }  
} 
