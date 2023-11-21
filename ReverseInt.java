import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int number = sc.nextInt();
        System.out.println("ExtractDigits");
        while (number > 0) {
            System.out.print(" " + number % 10);
            number /= 10;
        }
    }
}
