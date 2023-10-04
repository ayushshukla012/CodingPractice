import java.util.*; 
public class team  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int testCases=input.nextInt();
          if (testCases >= 1 && testCases <= 1000) {
          	  int sum = 0;
		  int result = 0;
		  for (int i = 0; i < testCases; i++) {
		  	int petya = input.nextInt();
		  	int vasya = input.nextInt();
		  	int tonya = input.nextInt();
		  	if (((petya + vasya + tonya) >= 2) && (petya == 0 || petya == 1) && (vasya == 0 || vasya == 1) && (tonya == 0 || tonya == 1)) {
		  		sum += 1;
		  	}
		  }
		  System.out.println(sum);
		  sum = 0;
          }
          input.close();  
     }
}
