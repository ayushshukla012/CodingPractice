import java.util.*; 
public class wrongSubstraction  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int userInput = input.nextInt();
          int times = input.nextInt();
          int result = 0;
          int buffer = userInput;
	  for (int i = 0; i < times; i++) {
          	while (buffer >= 10) {
          		buffer %= 10;
          	}
          	if (buffer == 0)
          		userInput /= 10;
          	else
          		userInput -= 1;
          	buffer = userInput;
          }
          	System.out.println(userInput);
          input.close();  
     }
}
