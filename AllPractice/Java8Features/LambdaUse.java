/*
 * Define your own functional interface and use it with a lambda to perform
 * different arithmetic operations dynamically.
 * 
 * Create a FunctionalInterface called Operation with a method int apply(int a,
 * int b).
 * 
 * Implement add, subtract, multiply, and divide using lambdas.
 * 
 * Pass them into a method that performs the operation.
 */
package Java8Features;

@FunctionalInterface
interface OperationFunctionalInterface {
    int apply(int a, int b);
}

public class LambdaUse {

    public static void main(String[] args) {

        OperationFunctionalInterface add = (a, b) -> a + b;
        OperationFunctionalInterface sub = (a, b) -> a - b;
        OperationFunctionalInterface mul = (a, b) -> a * b;
        OperationFunctionalInterface div = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divide by zero error");
            }
            return a / b;
        };

        System.out.println("Addition: " + add.apply(5, 3));
        System.out.println("Subtraction: " + sub.apply(5, 3));
        System.out.println("Multiplication: " + mul.apply(5, 3));
        System.out.println("Division: " + div.apply(5, 3));
    }
}
