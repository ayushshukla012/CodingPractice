import java.util.*; 
public class pashaAndHamster
{ 
    public static void main(String[] args)  
    {
          Scanner input=new Scanner(System.in); 
          int numOfPasha=input.nextInt()+1;
          int numOfArthur=input.nextInt();
          int numOfAlexandar=input.nextInt();
          int[] result = new int[numOfPasha];
          Arrays.fill(result,0);
          int[] dataOfArthur = new int[numOfArthur];
          int[] dataOfAlexandar = new int[numOfAlexandar];
          for (int i = 0; i < numOfArthur; i++) {
          	int index =input.nextInt();
          	result[index] = 1;
          }
          for (int i = 0; i < numOfAlexandar; i++) {
          	dataOfAlexandar[i] =input.nextInt();
          }
          for (int i = 1; i < numOfPasha; i++) {
          	if (result[i] == 0) {
          		result[i] = 2;
          	}
          	System.out.print(result[i]+" ");
          }
          input.close();  
     }
}
