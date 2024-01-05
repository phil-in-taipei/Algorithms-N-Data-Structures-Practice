const Stack =  require('../02-stack-implementation/stack');

function balancedParenthesis(inputString) {
    const stack = new Stack();
    for (const char of inputString) {
        if (char === '(') {
            stack.push(char);
        } else {
            if(stack.isEmpty()) {
                return false;
            }
            stack.pop();
        }
    }
    return stack.isEmpty();
}

module.exports = balancedParenthesis;
