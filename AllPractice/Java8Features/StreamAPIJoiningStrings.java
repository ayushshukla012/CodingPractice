package Java8Features;

// Joining Strings:

// Concatenate a list of strings into a single string separated by commas using the Stream API.​

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIJoiningStrings {
    
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // Joining the strings with a comma separator
        String result = strings.stream()
                               .collect(Collectors.joining(", "));

        // Output the result
        System.out.println(result);  // Output: Java, Python, C++, JavaScript
    }
}
