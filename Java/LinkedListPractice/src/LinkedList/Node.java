package LinkedList;

public class Node {

    Node next;

    int data;

    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nextData=" + next.getData() +
                ", data=" + data +
                '}';
    }
}
