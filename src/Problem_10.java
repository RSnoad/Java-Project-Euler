// Find sum of primes below 2 million.
import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class Problem_10 {
    public static void main(String[] args) {
        sumPrime(10);
        sumPrime(2000000);
    }

// Function to sum primes below input n.
    public static void sumPrime(int n) {
        int i = 2;
        double sum = 0d;
        while( i < n) {
            if(isPrime(i)) {
                sum += i;
            }
        i++;
        }
        // Print formatted string: %.0f means 0 places in fractional part.
        System.out.printf("%.0f\n",sum);
    }


// Brute force method to check if a number is prime.
// Could also clean up to give error for certain input ( negatives, decimals etc)
    public static boolean isPrime(int n) {
        for (int i = 2; i < floor(sqrt(n)) + 1; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        // This statement seems to be required - ask if there's a better way as this seems messy.
        return true;
    }
}
