package Medium;

public class ReverseBits {
    static void bruteForceApproach(int num) {
        int reverseNumber = 0;
        while(num > 0) {
            reverseNumber <<= 1;
            if(((int)num&1) == 1){
                reverseNumber ^= 1;
            }
            num >>=1;
        }
         System.out.println("Reversed bits:  " + 
                            String.format("%32s", Integer.toBinaryString(reverseNumber)).replace(' ', '0'));
        System.out.println("Reverse Number: "+reverseNumber);
    }
    public static void main(String[] args) {
        int num=6;
        bruteForceApproach(num);
    }
}
