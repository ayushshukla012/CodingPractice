import java.util.*; 
public class stonesOnTheTable  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int numOfStone = input.nextInt();
          String colorOfStone = input.next();
          int result = 0;
	  for (int i = 0; i < numOfStone-1; i++) {
          	if (colorOfStone.charAt(i) == colorOfStone.charAt(i+1)) {
 			result += 1;         	
          	}
          }
          System.out.println(result);
          input.close();  
     }
}
