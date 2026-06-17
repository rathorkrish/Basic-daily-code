import java.util.Scanner;

public class LargestArrayElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=1;i<n;i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest Element = " + max);

        sc.close();
    }
}
