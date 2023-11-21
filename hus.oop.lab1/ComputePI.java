import java.util.Scanner;

public class ComputePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int Maxdemon = 1000;
        for (int denominator = 1; denominator <= Maxdemon; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1 / denominator;
            } else {
                System.out.println("Impossible!!");
            }
        }
        System.out.println(" pi = " + (4 * sum));
        double pi = 4 * sum;
        System.out.println("% " + (pi / Math.PI) * 100);
    }
}
