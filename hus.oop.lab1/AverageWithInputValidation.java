import java.util.Scanner;

class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int student1;
        int student2;
        int student3;
        int numberIn;
        boolean isValid;
        double average;
        for (int studentNo = 1; studentNo <= 3; ++studentNo) {
            isValid = false;
            int n;
            do {
                System.out.println("Enter the mark (0-100) for student " + studentNo + ": ");
                n = sc.nextInt();
                if (n >= 0 && n <= 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);

            sum += n;
        }
        System.out.println("Sum = " + sum);
    }

}
