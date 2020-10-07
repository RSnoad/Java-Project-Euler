//Find the 10,001st prime number.

import static java.lang.Math.sqrt;
import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.List;


public class Problem_7 {
    public static void main(String[] args) {

        nthPrime(6);
        nthPrime(10001);
    }

// Function to find the nth prime in list using the isPrime function below.
    public static void nthPrime(int n) {

        int i = 2;
        // Creating list to store primes.
        List<Integer> primeList = new ArrayList<>();
        // Variable to track size of primeList as couldn't get size() to work (non-static in static).
        int j =0;
        // While loop to add primes less than n to primeList.
        while (j < n ) {
            if(isPrime(i)) {
                primeList.add(i);
                j++;
            }
            i++;
        }
        // Print final entry in primeList.
        System.out.println(primeList.get(n - 1));
    }

// Brute force method to check if a number is prime.
// Could also clean up to give error for certain input ( negatives, decimals etc)
    public static boolean isPrime(int n) {
        for(int i = 2; i < floor(sqrt(n)) + 1; i++) {
            if(n % i == 0) {
                return false;
            }

        }
        // This statement seems to be required - ask if there's a better way as this seems messy.
        return true;
    }
}
