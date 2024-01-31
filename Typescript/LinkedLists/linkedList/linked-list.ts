
class ListNode {
    data: number;
    next: ListNode | null;

    constructor(data: number) {
        this.data = data;
        this.next = null;
    }

    getData(): number | null {
        return this.data;
    }

    getNext(): ListNode | null {
        return this.next;
    }
}

class LinkedList {
    head: ListNode | null;
    tail: ListNode | null

    constructor() {
        this.head = null;
        this.tail = null;
    }

    add(data: number): void {
        const newNode: ListNode = new ListNode(data=data);
        if (this.head == null) {
            this.head = newNode;
        } else if (this.tail != null) {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    insertAt(index: number, data: number) {
        console.log(`Calling insert with index ${index} and data ${data}`)
        if (index == 0) {
            const newNode = new ListNode(data);
            newNode.next = this.head
            this.head = newNode
        }
        let currentNode: ListNode | null = this.head;
        let previousNode: ListNode | null = null;
        let currentIndex: number = 0;
        while(currentIndex < index && currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
        console.log(`Current node: ${currentNode}, current index: ${currentIndex}, previous node: ${previousNode}`)
        if (currentIndex == index && previousNode != null) {
            const newNode = new ListNode(data);
            newNode.next = currentNode;
            previousNode.next = newNode;
            if (currentNode == null) {
                this.tail = newNode;
            }
        }
    }

    printAll(): void {
        let currentNode: ListNode | null = this.head;
        while(currentNode != null) {
            console.log(currentNode.data);
            currentNode = currentNode.next;
        }
    }

}

module.exports = { ListNode, LinkedList };