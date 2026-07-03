public class LinearSearch2 {
    public static void main(String[] args) {

        int arr[] = {5, 12, 9, 18, 25};
        int key = 18;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element Not Found");
    }
}
