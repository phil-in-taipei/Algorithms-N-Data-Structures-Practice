const Queue = require('./queue');

const queue = new Queue();
console.log('-------------------------------------------------------------------------------')
console.log(`It is empty: ${queue.isEmpty()}`);
console.log(queue.deBug());
console.log(`It is full: ${queue.isFull()}`);
console.log(queue.enqueue(1));
console.log('-------------------------------------------------------------------------------')

console.log(queue.deBug());

console.log(queue.enqueue(2));
console.log('-------------------------------------------------------------------------------')

console.log(queue.deBug());

console.log(queue.enqueue(3));
console.log('-------------------------------------------------------------------------------')

console.log(queue.deBug());

console.log(queue.peek());
console.log(queue.dequeue());
console.log('-------------------------------------------------------------------------------')

console.log(queue.deBug());

console.log(queue.peek());
console.log(`Length: ${queue.getLength()}`);

console.log('-------------------------------------------------------------------------------')
