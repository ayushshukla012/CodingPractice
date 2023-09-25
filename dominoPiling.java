import java.util.*; 
public class dominoPiling  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int row=input.nextInt();
          int column=input.nextInt();
          int maxDominoes = 0;
          if ((row >= 1 && row <= 16) && (column >= 1 && column <= 16)) {
          		System.out.println((int)((row * column) / 2));
          }
          input.close();  
     }
}
