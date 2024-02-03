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

    public boolean contains(int data) {
        DLLNode currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public Object get(int index) {
        int currentIndex = 0;
        DLLNode currentNode = this.head;
        while (currentNode != null) {
            if (index == currentIndex) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        return null;
    }

    public String getDebugInfo(int index) {
        int currentIndex = 0;
        DLLNode currentNode = this.head;
        while (currentNode != null) {
            if (index == currentIndex) {
                return "NODE AT INDEX " + index + ": [" + currentNode.toString() + "]";
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        return "NODE AT INDEX " + index + ": [ERROR: NO NODE FOUND]";
    }

    public String getHead() {
        if (this.head == null) {
            return "Head is null";
        } else {
            return "HEAD: [" + this.head.toString() + "]";
        }
    }

    public int getLength() {
        return length;
    }

    public String getTail() {
        if (this.tail == null) {
            return "Tail is null";
        } else {
            return "TAIL: ["  + this.tail.toString() + "]";
        }
    }

    public void insertAt(int index, int data) {
        if (index > this.length) {
            return;
        } else if (index == this.length) {
            this.append(data);
        } else if (index == 0) {
            this.prepend(data);
        } else {
            DLLNode currentNode = this.head;
            int currentIndex =  0;
            while (currentIndex < index
                    && currentIndex< this.length
                    && currentNode.next != null
            ) {
                System.out.println(currentNode.toString());
                currentNode = currentNode.next;
                currentIndex++;
            }
            DLLNode newNode = new DLLNode(data);
            if (currentNode.previous != null) {
                newNode.previous = currentNode.previous;
                currentNode.previous.next = newNode;
                currentNode.previous = newNode;
                newNode.next = currentNode;
                this.length++;
            }
        }
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

    public void removeFrom(int index) {
        if (index >= this.length || index < 0 || this.head == null || this.tail == null) {
            return;
        } else if (index == 0) {
            if(this.head.next != null) {
                this.head.next.previous = null;
                this.head = this.head.next;
            } else {
                this.head = null;
            }
            this.length--;
        } else if (index == this.length - 1) {
            if(this.tail.previous != null) {
                this.tail.previous.next = null;
                this.tail = this.tail.previous;
                this.length--;
            }
        } else {
            DLLNode currentNode = this.head;
            int currentIndex =  0;
            while (currentIndex < index && currentNode.next != null
            ) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            if (currentNode.previous != null) {
                currentNode.previous.next = currentNode.next;
                assert currentNode.next != null;
                currentNode.next.previous = currentNode.previous;
                this.length--;
            }
        }
    }

}
