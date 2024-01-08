class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    
    constructor() {
        this.head = null;
        this.tail = null;
    }

    add(data) {
        const node = new Node(data);
        if (this.head === null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
    }

    printAll() {
        let current = this.head;
        while(current !== null) {
            console.log(current.data);
            current = current.next;
        }
    }

    
    printAllDebug() {
        let current = this.head;
        while(current !== null) {
            current = current.next;
        }
    }
}

module.exports = { Node, LinkedList };
