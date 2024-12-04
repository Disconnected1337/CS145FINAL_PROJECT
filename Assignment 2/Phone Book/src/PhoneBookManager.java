//Alonzo Turner
//CS145
//Assignment 2
//imports
import java.util.Comparator;

public class PhoneBookManager {
    private ContactNode head;

    // PhoneBook Constructor
    public PhoneBookManager() {
        this.head = null;
    }

    // Add Contact method
    public void addContact(String name, String address, String city, String phoneNumber) {
        ContactNode newContact = new ContactNode(name, address, city, phoneNumber);

        if (head == null) {
            head = newContact;
        } else {
            ContactNode current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newContact);
        }
    }

    // Display Contact Method
    public void displayContacts() {
        ContactNode current = head;
        while (current != null) {
            System.out.println("Name: " + current.getName());
            System.out.println("Address: " + current.getAddress());
            System.out.println("City: " + current.getCity());
            System.out.println("Phone Number: " + current.getPhoneNumber());
            System.out.println("-------------------");
            current = current.getNextNode();
        }
    }

    // Delete contact method
    public void deleteContact(String name) {
        if (head == null) return;

        if (head.getName().equals(name)) {
            head = head.getNextNode();
            return;
        }

        ContactNode current = head;
        while (current.getNextNode() != null && !current.getNextNode().getName().equals(name)) {
            current = current.getNextNode();
        }

        if (current.getNextNode() != null) {
            current.setNextNode(current.getNextNode().getNextNode());
        }
    }

    // Sort Contact Method
    public void sortContacts() {
        if (head == null || head.getNextNode() == null) return;

        boolean swapped;
        do {
            swapped = false;
            ContactNode current = head;
            while (current.getNextNode() != null) {
                ContactNode next = current.getNextNode();
                if (current.getName().compareTo(next.getName()) > 0) {
                    // Swap values
                    String tempName = current.getName();
                    current.name = next.getName();
                    next.name = tempName;
                    swapped = true;
                }
                current = next;
            }
        } while (swapped);
    }
}
