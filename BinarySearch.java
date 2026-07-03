import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {25, 10, 5, 18, 30};

        Arrays.sort(arr);

        int key = 18;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found at index " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found");
    }
}
