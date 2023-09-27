import java.util.*; 
public class beautifulMatrix 
{
    public static void main(String[] args)  
    {  
          Scanner input=new Scanner(System.in); 
          int[][] matrix = new int[5][5];
         // input.nextInt();
          int result = 0;
          int rowIndex = -1;
          int columnIndex = -1;
          for (int i = 0; i < 5; i++) {
          	for (int j = 0; j < 5; j++) {
          		matrix[i][j] = input.nextInt();
          		if (matrix[i][j] == 1) {
          			rowIndex = i;
          			columnIndex = j;
          		}
          	}
          }
          int output = (Math.abs(2 - rowIndex)) + (Math.abs(2 - columnIndex));	
	  System.out.println(output);
          input.close();  
     }
}
