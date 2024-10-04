// COMP1011 - Adv Object Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week04 Lab 1

// Circular Linked List Implementation
public class CircularLinkedList {

    // Node field that act as the last one
    private Node last;

    // Add a new node at the end
    public void addNode(int data) {
        // Creates a new instance of a node
        Node newNode = new Node(data);

        // If the last node is null, set it as the new node and also set the last as itself
        if (last == null) {
            last = newNode;
            last.next = last;
        } else { // As the last node is not null, set the next node and the last again
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    // Delete a node by the key
    public void deleteNode(int key) {
        // If the last node is null, just return
        if (last == null) {
            return;
        }

        // Instantiate the temp node and the previous
        Node temp = last.next;
        Node prev = last;

        // If the temp data is equal to the key and the temp is also the last, set the last to null and return
        if (temp.data == key && temp == last) {
            last = null;
            return;
        }

        // If the data is equal to the key, set the next as the temp next
        if (temp.data == key) {
            last.next = temp.next;
            return;
        }

        // Do that gets the prev, the temp as the next and, if the temp is not equal to the next and is different than
        // the key, repeat
        do {
            prev = temp;
            temp = temp.next;
        } while (temp != last.next && temp.data != key);

        // If the temp is equal to the next of the last, return
        if (temp == last.next) {
            return;
        }

        // Set the next of the previous as the next of the temp
        prev.next = temp.next;

        // If the temp is equal to the last, set the last as the prev
        if (temp == last) {
            last = prev;
        }
    }

    // Traverse and display the list
    public void display() {

        // If the last is null, print a message saying the list is empty
        if (last == null) {
            System.out.println("List is empty");
            return;
        }

        // Create a temp node
        Node temp = last.next;

        // Create a temporary string that will be displayed
        StringBuilder textToDisplay = new StringBuilder();

        // Do-While the temp node is not null, print the data and set the temp as the next node
        do {
            // If the text to display is empty, just set the temp data, otherwise add a -> before
            if (textToDisplay.isEmpty()) {
                textToDisplay = new StringBuilder(String.valueOf(temp.data));
            } else {
                textToDisplay.append(" -> ").append(temp.data);
            }

            // Set the temp node as the next one
            temp = temp.next;
        } while (temp != last.next);

        // Print the text to display
        System.out.println(textToDisplay);

        // Print a message informing the circular back to the head
        System.out.println("(circular back to head)");
    }
}