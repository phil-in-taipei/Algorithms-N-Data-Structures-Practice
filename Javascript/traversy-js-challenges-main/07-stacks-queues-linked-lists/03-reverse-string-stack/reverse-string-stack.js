const Stack =  require('../02-stack-implementation/stack');//require('./stack');

function reverseStringStack(inputString) {
    const stack = new Stack();
    let reversedString = '';
    for (const char of inputString) {
        stack.push(char);
    }
    while(!stack.isEmpty()) {
        reversedString += stack.pop();
    }
    return reversedString;
}

module.exports = reverseStringStack;
