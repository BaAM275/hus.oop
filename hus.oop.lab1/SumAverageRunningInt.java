import java.util.Scanner;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avarage;
        int count = 0;
        int sumSqua = 0;
        System.out.println("input LOWERBOUND");
        int LOWERBOUND = sc.nextInt();
        System.out.println("input UPPERBOUND");
        int UPPERBOUND = sc.nextInt();
        int low = LOWERBOUND;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            count++;
            sum += number;
        }
        avarage = (double) sum / count;
        System.out.println("the sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The avarage is " + avarage);
        //ex5 + ex1
        while (low <= UPPERBOUND) {
            sumSqua += low * low;
            low++;
        }
        System.out.println("sum of squares " + sumSqua);
        //ex6
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int i = 0; i <= UPPERBOUND; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        if (sumEven > sumOdd) {
            absDiff = sumEven - sumOdd;
        } else {
            absDiff = sumOdd - sumEven;
        }
        System.out.println("sumOdd = " + sumOdd);
        System.out.println("sumEven =  " + sumEven);
        System.out.println("absDiff = " + absDiff);
    }
}
