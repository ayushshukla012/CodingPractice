import java.util.*; 
public class gravityFlip  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int numOfInteger = input.nextInt();
          int[] userInput = new int[numOfInteger];
          for (int i = 0; i < numOfInteger; i++) {
          	userInput[i] = input.nextInt();
          }
          Arrays.sort(userInput);
          for (int i = 0; i < numOfInteger; i++) {
          	System.out.print(userInput[i] + " ");
          }
          input.close();  
     }
}
