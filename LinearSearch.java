import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10,20,30,40,50,60};

        System.out.print("Enter Element To Search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key) {
                System.out.println("Element Found At Index " + i);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Element Not Found");

        sc.close();
    }
}
