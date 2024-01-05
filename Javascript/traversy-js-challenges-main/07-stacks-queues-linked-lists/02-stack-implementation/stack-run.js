const Stack = require('./stack');

const stack = new Stack();
console.log('--------------------------------------------------------------------------------');
console.log(`The stack is empty: ${stack.isEmpty()}`);
stack.push(1);
stack.push(2);
stack.push(3);
console.log('--------------------------------------------------------------------------------');
console.log(`The stack is empty: ${stack.isEmpty()}`);
console.log('--------------------------------------------------------------------------------');
console.log(`Stack: ${stack.debugState()}`);
console.log('--------------------------------------------------------------------------------');
console.log(`Poppin' off: ${stack.pop()}`);
console.log('--------------------------------------------------------------------------------')
console.log(`The top item is: ${stack.peek()}`);
console.log('--------------------------------------------------------------------------------');
console.log(`Stack: ${stack.debugState()}`);
console.log('--------------------------------------------------------------------------------')
