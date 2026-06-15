import java.util.LinkedList;
import java.util.Scanner;

class LinkedListDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            String element = sc.nextLine();
            list.add(element);
        }

        System.out.println("\nLinked List Elements:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("\nTotal Elements: " + list.size());

        if (!list.isEmpty()) {
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());
        }

        System.out.print("\nEnter element to search: ");
        String search = sc.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " found in the Linked List.");
        } else {
            System.out.println(search + " not found in the Linked List.");
        }

        sc.close();
    }
}
