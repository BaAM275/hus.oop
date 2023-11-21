import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        input(number);
    }

    public static void input(int number) {
        do {
            System.out.println("Enter a number between 0-10 or 90-100:");
            if (number > 0 && number < 10 || number > 90 && number < 100) {
                break;
            }
            System.out.println("Invalid input, try again...");
        } while (!(number > 0 && number < 10 || number > 90 && number < 100));
    }
}

