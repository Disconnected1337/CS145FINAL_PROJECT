//Alonzo Turner
//CS145
//11.26.24


public class Node {
    int key; //key
    String firstName, lastName, streetAddress, city, state, zip, email, phone;
    Node left, right;

    public Node(int key, String firstName, String lastName, String streetAddress, String city, 
                String state, String zip, String email, String phone) {
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
        this.left = null;
        this.right = null;
    }
}
