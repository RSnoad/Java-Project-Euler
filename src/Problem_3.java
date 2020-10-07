import static java.lang.Math.sqrt;
import static java.lang.Math.round;

public class Problem_3 {
    public static void main(String[] args) {
        largestPrime(600851475143d);
    }


    public static void largestPrime(double n) {
        int i = 2;

        while (i < sqrt(n)) {
            if (n % i != 0) {
                i += 1;
            }
            else {
                n = n / i;
            }
        }
        System.out.println(round(n));
    }
}
