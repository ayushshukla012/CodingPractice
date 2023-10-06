import java.util.*; 
public class wordCapitalization  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          String userInputString1=input.nextLine();
          if (!userInputString1.isEmpty()) {
          	StringBuilder stringCapitalize = new StringBuilder(userInputString1);
          	stringCapitalize.setCharAt(0,Character.toUpperCase(userInputString1.charAt(0)));
		System.out.println(stringCapitalize);
          }
          input.close();  
     }
}
