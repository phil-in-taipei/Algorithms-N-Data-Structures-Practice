class Stack {

    constructor() {
        this.maxSize = 100;
        this.stack = [];
        this.top = -1;
    };

    debugState() {
        return `This is the top: ${this.top}, and this is the stack data: ${this.stack}`;
    }

    isEmpty() {
        return this.top === -1;
    }

    isFull() {
        return this.top === this.maxSize - 1;
    };

    peek() {
        if (this.isEmpty()) {
            return null;
        }
        return this.stack[this.top];
    }

    pop() {
        if(this.isEmpty()) {
            return null;
        }
        const itemToReturn = this.stack[this.top];
        this.stack[this.top] = null;
        this.top--;
        return itemToReturn;
        // return this.stack.pop();
    }

    push(item) {
        if (this.isFull()) {
            return false;
        }
        this.top++;
        this.stack[this.top] = item;
        return true;   
    };


}

module.exports = Stack;
