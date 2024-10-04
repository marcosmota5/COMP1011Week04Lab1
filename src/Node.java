// Node class that will be used in all lists implementations
public class Node {

    // Node fields
    int data;
    Node prev;
    Node next;

    // Constructor that takes the data as a parameter
    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}