const Queue = require('../06-queue-implementation/queue');

const reverseStringWithQueue = (str) => {
    let reversedString = '';
    const queue = new Queue();
    for (const char of str) {
        queue.enqueue(char);
    }
    while(!queue.isEmpty()) {
        reversedString = queue.dequeue() + reversedString;
    }
    return reversedString;
};

module.exports = reverseStringWithQueue;
