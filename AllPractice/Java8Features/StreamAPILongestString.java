package Java8Features;

// Longest String:

import java.util.Arrays;
import java.util.List;

// Find the longest string in a list using the Stream API.​

public class StreamAPILongestString {
    public static void main() {
        List<String> strings = Arrays.asList("apple", "banana", "strawberry", "kiwi");

        String longestString = strings.stream()
                    .reduce()
        
    }
}
