import java.util.*; 
public class evenOdds  
{ 
    public static void main(String[] args)  
    {  
        Scanner input=new Scanner(System.in); 
        int totalUserInput = input.nextInt();
        int searchIndex = input.nextInt();
        if (searchIndex <= (totalUserInput + 1) / 2) {
            // The position is in the range of odd numbers
            System.out.println(2 * searchIndex - 1);
        } else {
            // The position is in the range of even numbers
            searchIndex -= (totalUserInput + 1) / 2;
            System.out.println(2 * searchIndex);
        }
        input.close();  
     }
}
