import java.util.*; 
public class bit 
{
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int testCases = input.nextInt();
          int result = 0;
          for (int i = 0; i < testCases; i++) {
          	String userInput = input.next();
          	if ((userInput.equalsIgnoreCase("X++")) || (userInput.equalsIgnoreCase("++X"))) {
          		result += 1;
          	} else if ((userInput.equalsIgnoreCase("--X")) || (userInput.equalsIgnoreCase("X--"))) {
          		result -= 1;
          	}
          }
	  System.out.println(result);
          input.close();  
     }
}
