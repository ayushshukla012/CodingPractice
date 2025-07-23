package Java8.Lambda;
//Convert an anonymous Runnable to a lambda.

public class Question2 {
    public static void main(String[] args) {
      Runnable lambdaRunnable = () -> {
        System.out.println("Anonymous runnable to a lambda.");
    };

        lambdaRunnable.run();   
    }
   
}