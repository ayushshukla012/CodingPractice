import java.util.*;
public class jokeProgrammingLanguage 
{
    public static final char HELLO_WORLD = 'H';
    public static final char SOURCE_CODE = 'Q';
    public static final char BOTTLE_OF_BEER = '9';
    public static final char INTERNAL_INCREAMENT = '+';

    public static void main(String[] args)  
    {  
        Scanner input=new Scanner(System.in); 
        String caseSensitiveInput = input.nextLine();
        String outputResult = "NO";
        for (int i = 0; i < caseSensitiveInput.length(); i++) {
            char stringIndex = caseSensitiveInput.charAt(i);
            if (stringIndex == HELLO_WORLD || stringIndex == SOURCE_CODE || 
                stringIndex == BOTTLE_OF_BEER || stringIndex == INTERNAL_INCREAMENT) {
                    outputResult = "YES";
            }
        }
        System.out.println(outputResult);
        input.close();  
     }
}
