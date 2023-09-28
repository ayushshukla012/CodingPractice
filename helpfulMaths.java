import java.util.*; 
public class helpfulMaths  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          StringBuilder result = new StringBuilder();
          String userInput=input.nextLine();
          if (!userInput.isEmpty()) {
          	if (userInput.length() == 1) {
          		System.out.println(userInput);
          	} else {
          		String[] splitString = userInput.split("\\+");
          		Arrays.sort(splitString);
          		for (int i = 0; i < splitString.length; i++) {
          			result.append(splitString[i]);
          			if (i < splitString.length -1) {
          				result.append("+");
          			}	
          		}
          		System.out.println(result);	
          	}
          }
          input.close();  
     }
}
