package DSA.src.com.practice.recursion;

public class GCD {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    static  int countZero(int n){
        if(n==0){
            return 0;
        }
        if (n%10==0){
            return  1+countZero(n/10);
        }
        return countZero(n/10);
    }

    static void main(String[] args) {
      //  System.out.println(gcd(3, 7));
        System.out.println(countZero(102048));
        // System.out.println((int) (Math.log10(1234))+1);
    }
}
