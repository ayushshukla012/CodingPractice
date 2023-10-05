import java.util.*; 
public class petyaAndStrings  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          String userInputString1=input.nextLine();
          String userInputString2=input.nextLine();
          if ((!userInputString1.isEmpty()) && (!userInputString2.isEmpty())) {
		String lowerString1 = userInputString1.toLowerCase();
		String lowerString2 = userInputString2.toLowerCase();	
		int result = lowerString1.compareTo(lowerString2);
		if (result > 0)
			System.out.println(1);
		else if (result < 0)
			System.out.println(-1);
		else if (result == 0)
			System.out.println(0);
          }
          input.close();  
     }
}
