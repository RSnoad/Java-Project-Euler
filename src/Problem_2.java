import java.lang.Math;


public class Problem_2 {
    public static void main(String[] args) {
        int total = 0;
         /*Again, 33rd entry is the largest entry < 4mil, may want to come back and write loop to find this
        instead of using magic numbers*/
        for (int i = 0; i <34;i++ ) {
            if(fSequence(i) % 2 == 0) {
                total += fSequence(i);
            }
            
        }
        System.out.println("total = " + total);
    }

    // Function for Fibonacci sequence using formula.
    public static int fSequence(int n) {
                double euler = (Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) / (Math.pow(2, n) * Math.sqrt(5));
                return (int) euler;
    }
}

