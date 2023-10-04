import java.util.*; 
public class nextRound  
{ 
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int testCases = input.nextInt();
          int minimumScore = input.nextInt();
          int passedCandidates = 0;
          int[] candidateScore = new int[testCases];
          if ((testCases >= 1 && testCases <= 50) && (testCases >= minimumScore)) {
		  for (int i = 0; i < testCases; i++) {
		  	candidateScore[i] = input.nextInt();
		  }
		  for (int i = 0; i < testCases; i++) {
		  	if ((candidateScore[i] >= candidateScore[minimumScore-1]) && (candidateScore[i] > 0)) {
		  		passedCandidates += 1;
		  	}
		  }
		  System.out.println(passedCandidates);
		  passedCandidates = 0;
          }
          input.close();  
     }
}
