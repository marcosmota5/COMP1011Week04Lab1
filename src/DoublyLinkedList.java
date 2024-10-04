// COMP1011 - Adv Object Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week04 Lab 1

// Doubly Linked List Implementation
public class DoublyLinkedList {

    // Node field that act as the head of the list
    private Node head;

    // Add a new node at the end of the list
    public void addNode(int data) {
        // Creates a new instance of a node
        Node newNode = new Node(data);

        // If the head node is null, set it as the new node
        if (head == null) {
            head = newNode;
        } else {
            // As the head node is not null, creates a temp node and set it as the head
            Node temp = head;

            // While the next node is not null, set the temp as the next node so it can assign the next node correctly
            while (temp.next != null) {
                temp = temp.next;
            }

            // Set the next node of the temp node as the new one and the previous as the actual node
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Delete a node by the key
    public void deleteNode(int key) {
        // Creates a temp node and set it as the head
        Node temp = head;

        // If the temp node is not null and the data is not equal to the key, set the temp node as the next one
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If the temp node is null, just return
        if (temp == null) {
            return;
        }

        // If the previous node is not null, set the next of the previous node to the next of the temp
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else { // As the previous is equal to null, just set the head as the next node
            head = temp.next;
        }

        // If the next node is not null, set the next of the previous node to the previous of the temp
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    // Traverse and display the list
    public void display() {

        // Create a temp node
        Node temp = head;

        // If the head is null, print a message saying the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Create a temporary string that will be displayed
        StringBuilder textToDisplay = new StringBuilder();

        // While the temp node is not null, print the data and set the temp as the next node
        while (temp != null) {

            // If the text to display is empty, just set the temp data, otherwise add a -> before
            if (textToDisplay.isEmpty()) {
                textToDisplay = new StringBuilder(String.valueOf(temp.data));
            } else {
                textToDisplay.append(" -> ").append(temp.data);
            }

            // Set the temp node as the next one
            temp = temp.next;
        }

        // Print the text to display
        System.out.println(textToDisplay);
    }
}