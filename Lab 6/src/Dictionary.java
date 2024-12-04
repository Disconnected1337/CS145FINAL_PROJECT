//Alonzo Turner
//CS145
//11.26.24


public class Dictionary {
    private Node root;

    public Dictionary() {
        root = null;
    }

    //New node
    public void add(int key, String firstName, String lastName, String streetAddress, String city, 
                    String state, String zip, String email, String phone) {
        root = addRecursive(root, key, firstName, lastName, streetAddress, city, state, zip, email, phone);
    }

    private Node addRecursive(Node current, int key, String firstName, String lastName, String streetAddress, 
                               String city, String state, String zip, String email, String phone) {
        if (current == null) {
            return new Node(key, firstName, lastName, streetAddress, city, state, zip, email, phone);
        }

        if (key < current.key) {
            current.left = addRecursive(current.left, key, firstName, lastName, streetAddress, city, state, zip, email, phone);
        } else if (key > current.key) {
            current.right = addRecursive(current.right, key, firstName, lastName, streetAddress, city, state, zip, email, phone);
        } else {
            System.out.println("Key already exists.");
        }

        return current;
    }

    //Search node
    public Node search(int key) {
        return searchRecursive(root, key);
    }

    private Node searchRecursive(Node current, int key) {
        if (current == null || current.key == key) {
            return current;
        }
        return key < current.key
                ? searchRecursive(current.left, key)
                : searchRecursive(current.right, key);
    }

    //Mod node
    public void modify(int key, String newEmail, String newPhone) {
        Node node = search(key);
        if (node != null) {
            node.email = newEmail;
            node.phone = newPhone;
            System.out.println("Node updated successfully.");
        } else {
            System.out.println("Key not found.");
        }
    }

    //Delete node
    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private Node deleteRecursive(Node current, int key) {
        if (current == null) {
            return null;
        }

        if (key == current.key) {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                int smallestValue = findSmallestValue(current.right);
                current.key = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
                return current;
            }
        }
        if (key < current.key) {
            current.left = deleteRecursive(current.left, key);
            return current;
        }
        current.right = deleteRecursive(current.right, key);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.key : findSmallestValue(root.left);
    }

    //Traverse
    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            printNode(node);
            traverseInOrderRecursive(node.right);
        }
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
    }

    private void traversePreOrderRecursive(Node node) {
        if (node != null) {
            printNode(node);
            traversePreOrderRecursive(node.left);
            traversePreOrderRecursive(node.right);
        }
    }

    public void traversePostOrder() {
        traversePostOrderRecursive(root);
    }

    private void traversePostOrderRecursive(Node node) {
        if (node != null) {
            traversePostOrderRecursive(node.left);
            traversePostOrderRecursive(node.right);
            printNode(node);
        }
    }

    private void printNode(Node node) {
        System.out.println("Key: " + node.key + ", Name: " + node.firstName + " " + node.lastName + 
                           ", Email: " + node.email + ", Phone: " + node.phone);
    }
}
