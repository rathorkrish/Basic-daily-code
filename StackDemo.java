import java.util.Stack;
import java.util.Scanner;

class StackDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            int value = sc.nextInt();
            stack.push(value);
        }

        System.out.println("\nStack Elements:");
        System.out.println(stack);

        if (!stack.isEmpty()) {
            System.out.println("Top Element (Peek): " + stack.peek());
        }

        System.out.println("\nPopping Elements:");
        while (!stack.isEmpty()) {
            System.out.println("Removed: " + stack.pop());
        }

        System.out.println("\nStack is Empty: " + stack.isEmpty());

        sc.close();
    }
}
