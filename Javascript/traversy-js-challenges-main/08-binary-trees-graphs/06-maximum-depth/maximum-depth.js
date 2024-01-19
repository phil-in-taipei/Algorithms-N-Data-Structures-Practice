class Node {
  constructor(data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

function maxDepth(rootNode) {
  if (!rootNode) {
    return 0;
  }

  const maxLeft = maxDepth(rootNode.left);
  const maxRight = maxDepth(rootNode.right);

  return Math.max(maxLeft, maxRight) + 1;
}

module.exports = {
  maxDepth,
  Node,
};
