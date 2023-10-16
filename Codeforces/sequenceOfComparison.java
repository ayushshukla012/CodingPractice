import java.util.*; 
public class sequenceOfComparison  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int testCases=input.nextInt();
          List<String> inputExpressions = new ArrayList<>(testCases);
          for (int i = 0 ; i < testCases; i++) {
          	inputExpressions.add(input.nextLine());
          }
          
          input.close();  
     }  
} 
