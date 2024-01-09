class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
        this.previous = null;    }
}

class DoublyLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.length = 0;
        this.debug = false
    }

    append(data) {
        let node = new Node(data);
        if (this.length === 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.previous = this.tail;
            this.tail = node;
        }
        this.length++;
        return true;
    }

    insert(index, data) {
        if(index < 0 || index > this.length) {
            return false;
        }

        if (this.length === 0) {
            return this.prepend(data);
        }
        
        if (this.length === index) {
            return this.append(data);
        }

        let currentNode = this.head;
        for(let i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        let newNode = new Node(data);
        newNode.next = currentNode.next;
        newNode.previous = currentNode;
        currentNode.next.previous = newNode;
        currentNode.next = newNode;
        this.length++;
        return true;
    }

    prepend(data) {
        let node = new Node(data);
        if (this.length === 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.previous = node;
            this.head = node;
        }
        this.length++;
        return true;
    }

    
    remove(index) {
        if(index < 0 || index > this.length || this.length === 0) {
            return false;
        }

        if (index === 0) {
            this.head = this.head.next;
            if (this.head) {
                this.head.previous = null;
            } else {
                this.tail = null;
            }
        } else if (index === this.length - 1) {
            this.tail = this.tail.previous;
            if (this.tail) {
                this.tail.next = null;
            } else {
                this.head = null;
            }
        } else {
            let currentNode = this.head;
            for(let i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            console.log(`Current node is: ${currentNode.data}; next: ${currentNode.next.data}`)
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
        }
        this.length--;
        return true;

    }

    printAll() {
        let current = this.head;
        while(current !== null) {
            console.log(current.data);
            current = current.next;
        }
    }

    setDebug() {
        this.debug = true;
    }

    turnOffDebug() {
        this.debug = false;
    }
}

module.exports = DoublyLinkedList;
