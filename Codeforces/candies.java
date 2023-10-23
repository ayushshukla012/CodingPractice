import java.util.*; 
public class candies
{ 
    public static void main(String[] args)  
    {
          Scanner input=new Scanner(System.in); 
          int numOfCandies=input.nextInt();
          int numOfFriends=input.nextInt();
          int[] candiesForFriends = new int[numOfFriends];    
          
          int baseCandies = numOfCandies / numOfFriends;
          int extraFriends = numOfCandies % numOfFriends;
        
	  for (int i = 0; i < numOfFriends; i++) {
		    candiesForFriends[i] = baseCandies;
	  }
	
	  for (int i = 0; i < extraFriends; i++) {
		    candiesForFriends[i]++;
	  }

	  for (int i = numOfFriends-1 ; i >= 0; i--) {
		    System.out.print(candiesForFriends[i]);
		    if (i > 0) {
		        System.out.print(" ");
		    }
	  }
          input.close();  
     }
}
