// Find sum of all multiples of 3 & 5 below 1000
public class Problem_1 {
    public static void main(String[] args) {

        int total = 0;
        for (int i = 0; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 ==0) {
            total += i;
            }
        }
        System.out.println(total);
    }
}
// This is a github test