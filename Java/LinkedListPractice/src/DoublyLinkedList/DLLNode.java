package DoublyLinkedList;

public class DLLNode {

    DLLNode previous;

    DLLNode next;

    int data;

    public DLLNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        String stringRepresentation = "Current Node: {Data: " + data + "}";
        if (this.next != null) {
            stringRepresentation += ", {Next Data: " + next.data + "}";
        }
        if (this.previous != null) {
            stringRepresentation = "{Previous Data: " + previous.data + "}, "
                    + stringRepresentation;
        }

        return stringRepresentation;
    }
}
