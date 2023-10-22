import java.util.*; 
public class secondPriceAuction
{ 
    public static void main(String[] args)  
    {
          Scanner input=new Scanner(System.in); 
          int numOfInput=input.nextInt();       
          int storeHighest = 0;
          int secondHighest = 0;
          int indexOfHighest = 0;
          int[] checkData = new int[numOfInput];
          for (int i = 0; i < numOfInput; i++) {
          	checkData[i] =input.nextInt();
          	if (checkData[i] > storeHighest) {
          		secondHighest = storeHighest;
          		storeHighest = checkData[i];
          		indexOfHighest = i+1;
          	} else if (checkData[i] > secondHighest) {
          		secondHighest = checkData[i];
          	}
          	
          }
          System.out.print(indexOfHighest + " " + secondHighest);
          input.close();  
     }
}
