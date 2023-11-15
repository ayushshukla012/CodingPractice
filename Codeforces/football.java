import java.util.*; 
public class football { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String booleanString = scanner.nextLine();
		
        int consecutiveCount = 1;
        char prevChar = booleanString.charAt(0);
        boolean result = true;

        for (int i = 1; i < booleanString.length(); i++) {
            char currentChar = booleanString.charAt(i);

            if (currentChar == prevChar) {
                consecutiveCount++;
                if (consecutiveCount >= 7) {
                    result = false;
                    break;
                }
            } else {
                consecutiveCount = 1;
                prevChar = currentChar;
            }
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
		scanner.close();
    	}
}
