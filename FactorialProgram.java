import java.util.Scanner;

class FactorialProgram {

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void displayResult(int number, long factorial) {
        System.out.println("\n==============================");
        System.out.println("Entered Number : " + number);
        System.out.println("Factorial      : " + factorial);
        System.out.println("==============================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      FACTORIAL CALCULATOR PROGRAM");
        System.out.println("======================================");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            displayResult(number, result);
        }

        sc.close();
    }
}
