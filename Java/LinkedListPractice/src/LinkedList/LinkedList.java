package LinkedList;

public class LinkedList {
    Node head;
    Node tail;

    int maxSize;

    public LinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
    }

    public void printAll() {
        Node currentNode = this.head;
        while(currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
