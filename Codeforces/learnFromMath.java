import java.util.*; 
public class learnFromMath
{ 
    public static void main(String[] args)  
    {
          Scanner input=new Scanner(System.in); 
          int userInput=input.nextInt();
          boolean flag = false;
          int num1 = -1;
          int num2 = -1;
          if(userInput >= 12) {
          	flag = true;
          	if (userInput % 2 == 0) {
          		num1 = 4;
          		num2 = userInput - 4;
          	} else {
          		num1 = 9;
          		num2 = userInput - 9;
          	}
          	/*for (int i = 2; i < userInput/2; i++) {
          		if (userInput % i == 0) {
          			if ((userInput - i) % i == 0) {
          				num1 = i;
          				num2 = (userInput - i);
		  			flag = true;
		  			break;
          			}
          		}
          	}*/
          	if (flag && num1 + num2 == userInput) {
          		System.out.println(num1 + " " + num2);
          	}
          }
          input.close();  
     }
}
