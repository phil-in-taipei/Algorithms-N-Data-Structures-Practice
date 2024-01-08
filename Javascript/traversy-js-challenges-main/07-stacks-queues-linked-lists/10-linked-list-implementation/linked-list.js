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
        this.debug = false;
    }

    add(data) {
        if (this.debug) {
            console.log(`Adding method called.......`)
        }
        const node = new Node(data);
        if (this.head === null) {
            if (this.debug) {
                console.log(`There is not  a head, so setting this as head: ${node.data}`)
            }
            this.head = node;
        } else {
            if (this.debug) {
                console.log(`There is a head (${this.head.data}), and the current tail is: ${this.tail.data}`)
            }
            this.tail.next = node;
        }
        this.tail = node;
        if (this.debug) {
            console.log(`New tail is ${this.tail.data}`)
        }
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

module.exports = { Node, LinkedList };
