import java.util.*; 
public class bearAndBigBrother  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int limak = input.nextInt();
          int bob = input.nextInt();
          if (limak <= 10 && bob >= 1) {
          	int numberOfYear = countYears(limak,bob);
          	System.out.println(numberOfYear);
          }
          input.close();  
     }
    
    public static int countYears(int limak, int bob) {
    	int result = 0;
    	 for (; limak <= bob; limak *= 3, bob *= 2) {
      		 result++;
    	}
    	return result;
    }
}
