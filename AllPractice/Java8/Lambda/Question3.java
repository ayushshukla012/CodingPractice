package Java8.Lambda;
//Lambda to find the greater of two integers.

import java.util.function.IntBinaryOperator;

public class Question3 {
    public static void main(String[] args) {
      IntBinaryOperator max = (a,b) -> (a>b?a:b);

      int num1=10;
      int num2=20;

      int result = max.applyAsInt(num1, num2);
      System.out.println("Result: " + result);
    }
   
}
