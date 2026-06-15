import java.util.Scanner;

class MultiplicationTable {

    public static void printTable(int number) {

        System.out.println("\n==============================");
        System.out.println("Multiplication Table of " + number);
        System.out.println("==============================");

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     MULTIPLICATION TABLE PROGRAM");
        System.out.println("====================================");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        printTable(number);

        sc.close();
    }
}
