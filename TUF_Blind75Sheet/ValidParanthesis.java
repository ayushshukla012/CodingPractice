package Arrays;

import java.util.Stack;

/*
Given a string s representing an expression containing various types of brackets: {}, (), and [], 
the task is to determine whether the brackets in the expression are balanced or not. 
A balanced expression is one where every opening bracket has a corresponding closing bracket 
in the correct order.
 */
public class ValidParanthesis {
        static void bruteForceApproach(String str) {
            Stack<Character> localStack = new Stack<>();
            for(int i=0;i<str.length();i++) {
                char currChar = str.charAt(i);
                if(currChar == '{' || currChar == '(' || currChar == '[') {
                    localStack.push(currChar);
                }
                else {
                    if (!localStack.empty() &&
                        (
                            (localStack.peek() == '{' && currChar == '}') ||
                            (localStack.peek() == '(' && currChar == ')') ||
                            (localStack.peek() == '[' && currChar == ']')
                        )) {
                            localStack.pop();
                            System.out.println("Valid pair found.");
                        }
                    else {
                        System.err.println("Not Valid Paranthesis.");
                    }
                }
            }
        }
    public static void main(String[] args) {
        String localString = "[{()}]";
        bruteForceApproach(localString);

    }
}
