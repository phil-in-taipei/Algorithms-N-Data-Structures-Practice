import DoublyLinkedList.DoublyLinkedList;
import LinkedList.LinkedList;


public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Initializing new linked list");
        LinkedList linkedList = new LinkedList(10);
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Printing Items in Linked List:");
        System.out.println("-------------------------------------------------------------------------------------------");
        linkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("It contains 200: " + linkedList.contains(200));
        System.out.println("Item at index 0: " + linkedList.get(0));

        System.out.println("Item at index 1: " + linkedList.get(1));
        System.out.println("Item at index 5: " + linkedList.get(5));

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Inserting 250 at index 2:");
        linkedList.insertAt(2, 250);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Inserting 50 at index 0:");
        linkedList.insertAt(0, 50);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Inserting 450 at index 6:");
        linkedList.insertAt(6, 450);
        System.out.println("-------------------------------------------------------------------------------------------");
        linkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Removing index 3:");
        linkedList.removeFrom(3);
        System.out.println("-------------------------------------------------------------------------------------------");
        linkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Removing index 5:");
        linkedList.removeFrom(5);
        System.out.println("-------------------------------------------------------------------------------------------");
        linkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
      */
        System.out.println("Initializing new doubly linked list");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.append(100);
        doublyLinkedList.append(200);
        doublyLinkedList.append(300);
        doublyLinkedList.append(400);
        doublyLinkedList.prepend(50);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Printing Items in Doubly Linked List:");
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Printing Items in Doubly Linked List in reverse:");
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.printAllReverse();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(doublyLinkedList.getHead());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(doublyLinkedList.getTail());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Contains 50: " + doublyLinkedList.contains(50));
        System.out.println("Contains 200: " + doublyLinkedList.contains(200));
        System.out.println("Contains 400: " + doublyLinkedList.contains(400));
        System.out.println("Contains 500: " + doublyLinkedList.contains(500));
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Length is: " + doublyLinkedList.getLength());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(doublyLinkedList.get(4));
        System.out.println(doublyLinkedList.getDebugInfo(4));
        System.out.println(doublyLinkedList.getDebugInfo(2));
        System.out.println(doublyLinkedList.getDebugInfo(5));
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.insertAt(0, 150);
        System.out.println("Inserted 150 at index 0");
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.printAllReverse();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(doublyLinkedList.getHead());
        System.out.println(doublyLinkedList.getTail());
        System.out.println(doublyLinkedList.getDebugInfo(0));
        System.out.println("Length: " + doublyLinkedList.getLength());
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.removeFrom(1);
        System.out.println("Removed item from index 1");
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        doublyLinkedList.printAllReverse();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println(doublyLinkedList.getHead());
        System.out.println(doublyLinkedList.getTail());
        System.out.println(doublyLinkedList.getDebugInfo(1));
        System.out.println("Length: " + doublyLinkedList.getLength());
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}