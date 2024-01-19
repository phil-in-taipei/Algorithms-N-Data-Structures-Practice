//const Queue = require('./queue');
const Queue = require('../../07-stacks-queues-linked-lists/06-queue-implementation/queue');

class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

function breadthFirstTraversal(rootNode) {
  const result = [];
  if (!rootNode) {
    return result;
  }
  const queue = new Queue();
  queue.enqueue(rootNode);

  while(!queue.isEmpty()) {
    currentNode = queue.dequeue();
    result.push(currentNode.data);
    if (currentNode.left !== null) {
      queue.enqueue(currentNode.left)
    }

    if (currentNode.right !== null) {
      queue.enqueue(currentNode.right);
    }
  }
  return result;
}

module.exports = {
  Node,
  breadthFirstTraversal,
};
