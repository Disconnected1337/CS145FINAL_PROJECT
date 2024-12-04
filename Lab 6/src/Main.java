//Alonzo Turner
//CS145
//11.26.24


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        //Test data
        dictionary.add(1, "John", "Doe", "123 Main St", "Anytown", "CA", "12345", "john.doe@example.com", "555-1234");
        dictionary.add(2, "Jane", "Smith", "456 Elm St", "Othertown", "NY", "54321", "jane.smith@example.com", "555-5678");

        //Traversal
        System.out.println("In-Order Traversal:");
        dictionary.traverseInOrder();

        System.out.println("\nSearch for Key 1:");
        Node result = dictionary.search(1);
        if (result != null) {
            System.out.println("Key: " + result.key + ", Name: " + result.firstName + " " + result.lastName);
        } else {
            System.out.println("Key not found.");
        }

        //Modify
        System.out.println("\nModifying Key 2...");
        dictionary.modify(2, "new.jane@example.com", "555-9999");

        //Traverse
        System.out.println("\nPost-Order Traversal:");
        dictionary.traversePostOrder();

        scanner.close();
    }
}
