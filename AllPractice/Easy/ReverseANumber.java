public class ReverseANumber {
    public static void main(String[] args) {
        Integer n =12345;
        int revNum=0;
        while (n!=0) {
            int remainder = n%10;
            revNum = revNum*10+remainder;
            n=n/10;
        }
        System.out.println(revNum);
    }   
}
