import java.util.*; 
public class wayTooLongWords  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int testCases=input.nextInt();
          if (testCases >= 1 && testCases <= 100) {
		  String[] resultArray = new String[testCases];
		  String userInput = "";
		  int strLength = 0;
		  for (int i = 0; i < testCases; i++) {
		  	userInput = input.next();
		  	strLength = userInput.length();
		  	if (strLength > 10) {
		  		resultArray[i] = userInput.charAt(0) + Integer.toString(strLength-2) + userInput.charAt(strLength-1);
		  	} else {
		  		resultArray[i] = userInput;
		  	}
		  	strLength = 0;
		  }
		  for (int i = 0; i < testCases; i++) {
		  	System.out.println(resultArray[i]);
		  }
          }
          input.close();  
     }  
} 
