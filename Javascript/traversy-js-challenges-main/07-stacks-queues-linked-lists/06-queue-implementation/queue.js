class Queue {
    constructor() {
        this.queue = [];
        this.head = 0;
        this.tail = 0;
        this.maxSize = 100;
    }

    deBug() {
        return `Queue head is ${this.head}, queue tail is ${this.tail} and data is ${this.queue}`
    }

    dequeue() {
        // not deleting the actual data from the array (for whatever reason)
        const item = this.queue[this.head];
        this.head++;
        return item;
    }

    enqueue(item) {
        if(this.isFull()) {
            return false;
        }
        this.queue[this.tail] = item;
        this.tail++;
        return true;
    }

    getLength() {
        return this.tail - this.head;
    }

    isEmpty() {
        return this.getLength() === 0;
    }


    isFull() {
        return this.getLength() >= this.maxSize;
    }

    peek() {
        return this.queue[this.head];
    }

}

module.exports = Queue;
