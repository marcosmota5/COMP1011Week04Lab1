// COMP1011 - Adv Object Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week04 Lab 1

public class Main {
    public static void main(String[] args) {

        System.out.println("########## Java Program - Linked Lists Example - v1.0 ##########\n");

        // ########## Singly Linked List ##########
        System.out.println("Singly Linked List\n");

        // Create a singly linked list, add some nodes and display it. Then, delete a node and display again
        SinglyLinkedList sll = new SinglyLinkedList();
        System.out.println("Adding 3 nodes...");
        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        System.out.print("Initial list: ");
        sll.display();
        System.out.println("Deleting node 2...");
        sll.deleteNode(2);
        System.out.print("Final list: ");
        sll.display();

        // ########## Doubly Linked List ##########
        System.out.println("\n\nDoubly Linked List\n");

        // Create a doubly linked list, add some nodes and display it. Then, delete a node and display again
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Adding 3 nodes...");
        dll.addNode(10);
        dll.addNode(20);
        dll.addNode(30);
        System.out.print("Initial list: ");
        dll.display();
        System.out.println("Deleting node 20...");
        dll.deleteNode(20);
        System.out.print("Final list: ");
        dll.display();

        // ########## Doubly Linked List ##########
        System.out.println("\n\nDoubly Linked List\n");

        // Create a circular linked list, add some nodes and display it. Then, delete a node and display again
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println("Adding 3 nodes...");
        cll.addNode(100);
        cll.addNode(200);
        cll.addNode(300);
        System.out.print("Initial list: ");
        cll.display();
        System.out.println("Deleting node 200...");
        cll.deleteNode(200);
        System.out.print("Final list: ");
        cll.display();
    }
}