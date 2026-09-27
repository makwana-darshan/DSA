package DSA.src.com.largenumber;

import java.math.BigInteger;

public class LargeNumber {
    static void main(String[] args) {
        BigInteger a=BigInteger.valueOf(6);
        BigInteger b=BigInteger.valueOf(654);
        BigInteger sum=a.add(b);
        System.out.println(sum);
    }
}
