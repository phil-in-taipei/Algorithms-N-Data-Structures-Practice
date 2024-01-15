package LinkedList;

import java.util.Optional;

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

    public boolean contains(int data) {
        Node currentNode = this.head;
        while(currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public Optional<Integer> get(int index) {
        Node currentNode = this.head;
        if (currentNode != null && index >= 0) {
            int currentIndex = 0;
            while(currentNode != null && currentIndex < index) {
                if(currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                    currentIndex++;
                } else {
                    return Optional.empty();
                }
            }
            assert currentNode != null;
            return Optional.of(currentNode.getData());
        }
        return Optional.empty();
    }

    public void insertAt(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            Node previousNode = null;
            Node currentNode = this.head;
            int currentIndex = 0;
            while(currentIndex < index) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            newNode.setNext(currentNode);
            assert previousNode != null;
            previousNode.setNext(newNode);
        }
    }

    public void printAll() {
        Node currentNode = this.head;
        while(currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public void removeFrom(int index) {
        if (index == 0) {
            if (this.head.getNext() != null) {
                this.head = this.head.getNext();
            } else {
                this.head = null;
            }

        } else {
            Node previousNode = null;
            Node currentNode = this.head;
            int currentIndex = 0;
            while(currentIndex < index) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            assert previousNode != null;
            previousNode.setNext(currentNode.getNext());
        }
    }
}
