import LinkedList.LinkedList;


public class Main {
    public static void main(String[] args) {
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

    }
}