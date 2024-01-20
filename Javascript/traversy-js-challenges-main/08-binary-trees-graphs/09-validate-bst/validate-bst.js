const Stack = require('../../07-stacks-queues-linked-lists/02-stack-implementation/stack');//require('./stack');


class Node {
  constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

function isValidBST(root) {
  let iterationNumber = 0;
  function isValidSubtree(node, min, max) {
    iterationNumber++;
    console.log('*********************************************************************')
    console.log(`Recursive iteration number ${iterationNumber} with min: ${min} and max ${max}`)
    if (!node) {
      console.log(`and no node -- so finishing subtree -- valid`)
      return true;
    }
    console.log(`And node with this value: ${node.value}`)
    if (
      (min !== null && node.value <= min) ||
      (max !== null && node.value >= max)
    ) {
      console.log(`It's false`)
      console.log(`First condition (value less than or equal to min): ${min !== null && node.value <= min}`)
      console.log(`Second condition (value greater than or equal to max): ${max !== null && node.value >= max}`)
      return false;
    }
    console.log('//////////////////////////////////////////////////////////////////////')
    console.log(`Valid: calling again with left and right nodes`)
    if (node.left) {
      console.log(`Node left: ${node.left.value}`);
    } else {
      console.log("Node left: null");
    }
    if (node.right) {
      console.log(`Node right: ${node.right.value}`);
    } else {
      console.log("Node right: null");
    }
    console.log("###################################################################")
    return (
      isValidSubtree(node.left, min, node.value) &&
      isValidSubtree(node.right, node.value, max)
    );
  }
  console.log(`Beginning the process with root value: ${root.value} and no min or max`)
  return isValidSubtree(root, null, null);
}

module.exports = { Node, isValidBST };
