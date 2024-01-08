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

    //note: below returns the full node or null
    /*
    get(index) {
        let currentNodeNumber = 0;
        let node = this.head;
        if (this.debug) {
            if(!node) {
                console.log('Head is null')
            }
        }
        if(node) {
            if(this.debug) {
                console.log(`Begining to iterate at index ${currentNodeNumber}. Data is: ${node.data}`)
            }
            while (currentNodeNumber < index) {
                node = node.next;
                if (node) {
                    currentNodeNumber++;
                    if (this.debug) {
                        console.log(`Iterated to next, now node data is ${node.data}`)
                    }
                } else {
                    if (this.debug) {
                        console.log(`Tried iterating to next, but there is no node`)
                    }
                    break;
                }
            }
        }
        return node;
    }
    */

    get(index) {
        let currentNodeNumber = 0;
        let node = this.head;
        while(currentNodeNumber < index) {
            node = node.next;
            currentNodeNumber++;
        }
        return node.data;
    }

    insertAt(index, data) {
        const node = new Node(data);
        if (index === 0) {
            if(this.debug) {
                console.log(`Inserting ${data} at zero`)
            }
            node.next = this.head;
            this.head = node;
            if(this.debug) {
                console.log(`The head is now this: ${this.head.data}`)
            }
        } else {
            if(this.debug) {
                console.log(`Inserting ${data} at ${index}`)
            }
            let currentNode = this.head;
            let previousNode = null;
            let currentNodeNumber = 0;
            while(currentNodeNumber < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentNodeNumber++;
            }
            if(this.debug) {
                console.log(`After iterating, the node number is ${currentNodeNumber} and the data is ${currentNode.data}`)
            }
            node.next = currentNode;
            previousNode.next = node;
            if(this.debug) {
                console.log(`Inserted, node data is '${node.data}' between ${previousNode.data} and ${node.next.data}`)
            }
        }
    }

    printAll() {
        let current = this.head;
        while(current !== null) {
            console.log(current.data);
            current = current.next;
        }
    }

    
    removeFrom(index) {
        if (index === 0) {
            if(this.debug) {
                console.log(`Removing from zero`)
            }
            this.head = this.head.next;
            if(this.debug) {
                console.log(`The head is now this: ${this.head.data}`)
            }
        } else {
            if(this.debug) {
                console.log(`Removing from ${index}`)
            }
            let currentNode = this.head;
            let previousNode = null;
            let currentNodeNumber = 0;
            while(currentNodeNumber < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentNodeNumber++;
            }
            if(this.debug) {
                console.log(`After iterating, the node number is ${currentNodeNumber} and the data is ${currentNode.data}`)
            }
            previousNode.next = currentNode.next;
            if(this.debug) {
                console.log(`Removed, node data is '${currentNode.data}' between ${previousNode.data} and ${currentNode.next.data}`)
            }
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
