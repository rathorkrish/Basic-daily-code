import java.util.Scanner;

public class ArrayOperations {

    // Method to display array
    static void displayArray(int arr[]) {
        System.out.println("\nArray Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to find maximum element
    static int findMax(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Method to find minimum element
    static int findMin(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Method to calculate sum
    static int findSum(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Bubble Sort Method
    static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        displayArray(arr);

        System.out.println("Maximum Element = " + findMax(arr));
        System.out.println("Minimum Element = " + findMin(arr));
        System.out.println("Sum of Elements = " + findSum(arr));

        sortArray(arr);

        System.out.println("\nArray After Sorting:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
