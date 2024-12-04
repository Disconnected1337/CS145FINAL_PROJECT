//Alonzo Turner
//CS145
//Assignment 2
//imports
public class ContactNode {
    private String name;
    private String address;
    private String city;
    private String phoneNumber;
    private ContactNode nextNode;

    // Constructor
    public ContactNode(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.nextNode = null;
    }

    // Gets and Sets
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getPhoneNumber() { return phoneNumber; }
    public ContactNode getNextNode() { return nextNode; }

    public void setNextNode(ContactNode nextNode) { this.nextNode = nextNode; }
}
