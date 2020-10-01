import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Find largest number that is a factor of 3 digit numbers.

public class Problem_4 {
    public static void main(String[] args) {

// Create list that stores integers.0
        List<Integer> palindromeList = new ArrayList<>();

// Nested loop to brute force multiplications.
        for (int i = 100; i <= 1000; i++) {
            for (int j = 100; j <= 1000; j++) {
                int k = i * j;

// Use palindrome function to add palindromic numbers to palindromeList.
                if (palindrome(k)) {
                    palindromeList.add(k);
                }
            }
        }
// Print the max value of palindromeList.
        System.out.println(Collections.max(palindromeList));

    }
// Method to check if a number is a palindrome.
    public static boolean palindrome(int n) {
       String reverse =  new StringBuilder(Integer.toString(n)).reverse().toString();
//        System.out.println(reverse);
//        boolean bool = reverse.equals(Integer.toString(n));
//        System.out.println(bool);
       return reverse.equals(Integer.toString(n));
    }
}



