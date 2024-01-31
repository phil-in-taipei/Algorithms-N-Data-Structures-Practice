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
}
module.exports = { ListNode, LinkedList };
