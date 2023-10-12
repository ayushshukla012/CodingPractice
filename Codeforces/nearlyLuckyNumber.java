import java.util.*; 
public class nearlyLuckyNumber  
{ 
    public static void main(String[] args)  
    {  
         Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        int result = countLuckyDigits(userInput);

        if (isNearlyLucky(result)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
     }
     
     public static int countLuckyDigits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (digit == '4' || digit == '7') {
                count++;
            }
        }
        return count;
    }

    public static boolean isNearlyLucky(int count) {
        return count == 4 || count == 7;
    }
}
