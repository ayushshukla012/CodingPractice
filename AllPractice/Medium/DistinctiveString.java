package Medium;

import java.util.HashSet;
import java.util.Set;

/*
 * find largest distinctive string in the given string. 
 * Example:
 *  Input: "abcdeabc"
 *  Output: "abcde"
 */
public class DistinctiveString {
    public static String longestDistinctSubstring(String input){
        int start=0,end=0,maxLen=0,maxStart=0;
        Set<Character> seenSet = new HashSet<>();
        
        while(end<input.length()) {
            char oneChar = input.charAt(end);
            if(!seenSet.contains(oneChar)) {
                seenSet.add(oneChar);
                if(end-start+1>maxLen) {
                    maxLen = end-start+1;
                    maxStart=start;
                }
                end++;
            } else {
                seenSet.remove(input.charAt(start));
                start++;
            }
        }
        return input.substring(maxStart,maxStart+maxLen);
    
    }
    
    public static void main(String[] args) {
        String input = "abbcdeabc";
        System.out.println("Longest distinct substring: " + longestDistinctSubstring(input));
       
    } 
}
