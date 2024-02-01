"use strict";
class ListNode {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
    getData() {
        return this.data;
    }
    getNext() {
        return this.next;
    }
}
class LinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
    }
    add(data) {
        const newNode = new ListNode(data = data);
        if (this.head == null) {
            this.head = newNode;
        }
        else if (this.tail != null) {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }
    contains(data) {
        let currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.data === data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    get(data) {
        let currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.data === data) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    getAtIndex(index) {
        let currentNode = this.head;
        let currentIndex = 0;
        if (index == 0) {
            if ((currentNode === null || currentNode === void 0 ? void 0 : currentNode.getData()) != null) {
                return currentNode;
            }
        }
        else {
            while (currentNode != null && currentIndex < index) {
                currentNode = currentNode.getNext();
                currentIndex++;
                if ((currentNode === null || currentNode === void 0 ? void 0 : currentNode.getData()) != null && currentIndex === index) {
                    return currentNode;
                }
            }
        }
        return null;
    }
    insertAt(index, data) {
        console.log(`Calling insert with index ${index} and data ${data}`);
        if (index == 0) {
            const newNode = new ListNode(data);
            newNode.next = this.head;
            this.head = newNode;
        }
        let currentNode = this.head;
        let previousNode = null;
        let currentIndex = 0;
        while (currentIndex < index && currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
        console.log(`Current node: ${currentNode}, current index: ${currentIndex}, previous node: ${previousNode}`);
        if (currentIndex == index && previousNode != null) {
            const newNode = new ListNode(data);
            newNode.next = currentNode;
            previousNode.next = newNode;
            if (currentNode == null) {
                this.tail = newNode;
            }
        }
    }
    printAll() {
        let currentNode = this.head;
        while (currentNode != null) {
            console.log(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    removeAt(index) {
        console.log(`Remove method; index: ${index}`);
        let currentNode = this.head;
        if (index === 0) {
            if (currentNode !== null && (currentNode === null || currentNode === void 0 ? void 0 : currentNode.getNext()) !== null) {
                this.head = currentNode.next;
                currentNode = null;
            }
        }
        else {
            let currentNode = this.head;
            let previousNode = null;
            let currentIndex = 0;
            while (currentIndex < index && currentNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
            console.log(`Current node: ${currentNode}, current index: ${currentIndex}, previous node: ${previousNode}`);
            if (currentIndex == index && previousNode != null && currentNode !== null) {
                previousNode.next = currentNode === null || currentNode === void 0 ? void 0 : currentNode.getNext();
                // check whether of not the last node has been removed
                if (previousNode.next == null) {
                    // if so, then reset the tail
                    this.tail = previousNode;
                }
            }
        }
    }
}
module.exports = { ListNode, LinkedList };
