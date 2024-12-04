//Alonzo Turner
//CS145
//Assignment 2
//imports
import java.util.Scanner;

public class PhoneBookApp {
    //Main
    public static void main(String[] args) {
        PhoneBookManager phoneBook = new PhoneBookManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //Menu
        while (running) {
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Sort Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline
            
            //User inputs switch case + options
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(name, address, city, phoneNumber);
                    break;
                case 2:
                    phoneBook.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    phoneBook.deleteContact(nameToDelete);
                    break;
                case 4:
                    phoneBook.sortContacts();
                    System.out.println("Contacts sorted alphabetically.");
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
