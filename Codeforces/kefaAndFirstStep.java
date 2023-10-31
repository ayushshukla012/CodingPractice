import java.util.*; 
public class kefaAndFirstStep  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int numOfInteger = input.nextInt();
          int[] userInput = new int[numOfInteger];
          int outputLength = 1;
          int prevOutputLength = 1;
          for (int i = 0; i < numOfInteger; i++) {
          	userInput[i] = input.nextInt();
          }
          
          for (int i = 1; i < numOfInteger; i++) {
          	if (userInput[i] >= userInput[i-1]) {
          		
          		prevOutputLength += 1;
          	} else {
          		prevOutputLength = 1;
          	}
          	if (prevOutputLength > outputLength) {
                outputLength = prevOutputLength;
            }
          }
          System.out.print(outputLength);
          input.close();  
     }
}
