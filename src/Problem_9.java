import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Problem_9 {


    public static void main(String[] args) {
        tripleTotal(12);
        tripleTotal(1000);
    }
// Function to find pythagorean triplet that totals input (uses pTriple function).
    public static void tripleTotal(int total) {
        for(int a = 1; a < total; a++) {
            for(int b = a+1; b < total; b++) {
                // c can't be int as we use sqrt.
                double c = sqrt(pow(a,2) + pow(b, 2));
                if(pTriple(a, b, c)) {
                    if(a + b + c == total) {
                        // Used 2 different ways of showing double as int: (int) to convert and printf ("%.0f\n", ).
                        System.out.println("a = " + a  + " b = " + b + " c = " + (int)c );
                        System.out.printf("%.0f\n",a * b * c);
                    }
                }
            }
        }
    }
// Function to determine if 3 integers are a pythagorean triple.
    public static boolean pTriple(int a, int b, double c) {
        return pow(a, 2) + pow(b, 2) == pow(c, 2);
    }

}

