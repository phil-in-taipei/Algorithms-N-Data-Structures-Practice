const Queue = require('../06-queue-implementation/queue');
const Stack = require('../02-stack-implementation/stack');

function isPalindromeQueueStack(stringToCheck) {
    const queue = new Queue();
    const stack = new Stack();
    const cleanedString = stringToCheck.toLowerCase().replace(/[^a-z0-9]/g, '');
    for (const char of cleanedString) {
        queue.enqueue(char);
        stack.push(char);
    }
   //while(!queue.isEmpty() && !stack.isEmpty()) {
   //     if (queue.dequeue() !== stack.pop()) {
   //         return false
   //    }
   // }
    let iteration = 0;
    while(iteration <= stringToCheck.length % 2) {
        if (queue.dequeue() !== stack.pop()) {
            return false
        }
        iteration++;
    }

    return true;
}

module.exports = isPalindromeQueueStack;
