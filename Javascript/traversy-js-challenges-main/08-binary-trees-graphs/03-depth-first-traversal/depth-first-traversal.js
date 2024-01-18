const Stack = require('../../07-stacks-queues-linked-lists/02-stack-implementation/stack');//require('./stack');


class Node {

  constructor(value) {
      this.left = null;
      this.right = null;
      this.value = value;
  }

}

function depthFirstTraversal(root) {
  const result = [];
  if (!root) {
    //console.log(`There is no root!`)
    return result;
  }
  //console.log(`There is a root -- implementing new stack....`)
  const stack = new Stack();
  stack.push(root);
  //console.log(`Pushing the root onto the stack with value: ${root.value}`)
  while(!stack.isEmpty()) {
    //console.log(`Beginning an iteration -- stack length is greater than zero`)
    const currentNode = stack.pop();
    //console.log(`Got a new node with value: ${currentNode.value}, and pushed on the stack`)
    result.push(currentNode.value);
    if (currentNode.right) {
      //console.log(`It has a right node with value: ${currentNode.right.value}, so pushing it on the stack`)
      stack.push(currentNode.right);
    }

    if (currentNode.left) {
      //console.log(`It has a left node with value: ${currentNode.left.value}, so pushing it on the stack`)
      stack.push(currentNode.left);
    }
    //console.log(`End of iteration with following results: ${result.toString()}`)

  }
  return result;
}

module.exports = {
  Node,
  depthFirstTraversal,
};
