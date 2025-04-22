//Write a Java 8 program using a lambda expression to add two integers.
import java.util.function.BiFunction;
public class LambdaAddTwoNumber {
    public static void main(String[] args) {
            BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
            System.out.println("Addition: "+ add.apply(5,3));
    }
}