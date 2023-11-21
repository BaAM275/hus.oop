import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int number = sc.nextInt();
        int arr[] = new int[number];
        int arr2[] = new int[number];
        arr[0] = 1;
        arr[1] = 1;
        for (int denom = 2; denom < number; denom++) {
            arr[denom] = arr[denom - 1] + arr[denom - 2];
        }
        System.out.println("Number sequence Fibonacci to " + number);
        for (int i = 0; i < number; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        //ex1
        System.out.println("Number sequence new to " + number);
        arr2[0] = 1;
        arr2[1] = 1;
        arr2[2] = 1;
        for (int denom = 3; denom < number; denom++) {
            arr2[denom] = arr2[denom - 1] + arr2[denom - 2] + arr2[denom - 3];
        }
        for (int i = 0; i < number; i++) {
            System.out.print(" " + arr2[i]);
        }

    }
}
