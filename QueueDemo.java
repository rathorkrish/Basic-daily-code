import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class QueueDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            int value = sc.nextInt();
            queue.add(value);
        }

        System.out.println("\nQueue Elements:");
        System.out.println(queue);

        if (!queue.isEmpty()) {
            System.out.println("Front Element: " + queue.peek());
        }

        System.out.println("\nRemoving Elements from Queue:");
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.remove());
        }

        System.out.println("\nQueue is Empty: " + queue.isEmpty());

        sc.close();
    }
}
