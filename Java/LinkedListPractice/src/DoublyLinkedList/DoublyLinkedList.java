package DoublyLinkedList;

public class DoublyLinkedList {

    private DLLNode head;

    private DLLNode tail;

    private int length;

    public DoublyLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void append(int data) {
        DLLNode newNode = new DLLNode(data);
        if (length == 0) {
            this.head = newNode;
        } else {
            newNode.previous = this.tail;
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.length++;
    }

    public void prepend(int data) {
        DLLNode newNode = new DLLNode(data);
        if (length == 0) {
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.previous = newNode;
        }
        this.head = newNode;
        this.length++;
    }

    public void printAll() {
        DLLNode currentNode = this.head;
        while (currentNode != null) {
            if (currentNode == this.head) {
                System.out.println("***************Head****************");
            }
            System.out.println(currentNode.data);
            if (currentNode == this.tail) {
                System.out.println("***************Tail****************");
            }
            currentNode = currentNode.next;
        }
    }

    public void printAllReverse() {
        DLLNode currentNode = this.tail;
        while (currentNode != null) {
            if (currentNode == this.tail) {
                System.out.println("***************Tail****************");
            }
            System.out.println(currentNode.data);
            if (currentNode == this.head) {
                System.out.println("***************Head****************");
            }
            currentNode = currentNode.previous;
        }
    }

    public String getHead() {
        if (this.head == null) {
            return "Head is null";
        } else {
            return this.head.toString();
        }
    }

    public String getTail() {
        if (this.tail == null) {
            return "Tail is null";
        } else {
            return this.tail.toString();
        }
    }

    public int getLength() {
        return length;
    }
}
