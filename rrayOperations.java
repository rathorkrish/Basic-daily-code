import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("\nArray Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum Element = " + max);
        System.out.println("Minimum Element = " + min);

        sc.close();
    }
}
