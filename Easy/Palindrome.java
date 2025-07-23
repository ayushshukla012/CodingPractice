public class Palindrome {
    public static void main(String[] args) {
        int n=12321;
        int revNum=0;
        int temp = n;
        while(n!=0) {
            int remainder=n%10;
            revNum=revNum*10+remainder;
            n=n/10;
        }
        System.out.println(revNum);
        if (temp==revNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
            
        }
    }
}
