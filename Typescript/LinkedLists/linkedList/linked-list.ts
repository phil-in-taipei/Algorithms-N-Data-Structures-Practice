
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

    contains(data: number): boolean {
        let currentNode = this.head;
        while(currentNode != null) {
            if (currentNode.data === data) {
                return true
            }
            currentNode = currentNode.next;
        }
        return false
    }

    get(data: number): ListNode|null {
        let currentNode = this.head;
        while(currentNode != null) {
            if (currentNode.data === data) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null
    }

    getAtIndex(index : number): ListNode | null {
        let currentNode = this.head;
        let currentIndex = 0;
        if (index == 0) {
            if(currentNode?.getData() != null) {
                return currentNode
            }
        } else {
            while(currentNode != null && currentIndex < index) {
                currentNode = currentNode.getNext();
                currentIndex++;
                if (currentNode?.getData() != null && currentIndex === index) {
                    return currentNode;
                }
            }
        }
        return null;
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

    removeAt(index : number) {
        console.log(`Remove method; index: ${index}`)
        let currentNode: ListNode|null = this.head;
        if (index === 0) {
            if (currentNode !== null && currentNode?.getNext() !== null) {
                this.head = currentNode.next
                currentNode = null
            }
        } else {
            let currentNode: ListNode | null = this.head;
            let previousNode: ListNode | null = null;
            let currentIndex: number = 0;
            while(currentIndex < index && currentNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
            console.log(`Current node: ${currentNode}, current index: ${currentIndex}, previous node: ${previousNode}`)
            if (currentIndex == index && previousNode != null && currentNode !== null) {
                previousNode.next = currentNode?.getNext();
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