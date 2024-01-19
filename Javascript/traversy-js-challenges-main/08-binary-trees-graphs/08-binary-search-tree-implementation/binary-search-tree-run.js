const { Node, BinarySearchTree } = require('./binary-search-tree');

// Create a binary search tree:
//       10
//      /  \
//     5    15
//    /
//   2

console.log('-------------------------------------------------------------------------------')
const binarySearchTree = new BinarySearchTree();
binarySearchTree.insert(10);
binarySearchTree.insert(5);
binarySearchTree.insert(15);
binarySearchTree.insert(2);
console.log('Initialized binary search tree and inserted values (10, 5, 15, 2):')
console.log('-------------------------------------------------------------------------------')

binarySearchTree.printTree();
console.log('-------------------------------------------------------------------------------')
const value = binarySearchTree.lookup(100);
console.log(`The is the node with value 100: ${value}`);
console.log('-------------------------------------------------------------------------------')
//console.log(`Removing node with value 5`);
//binarySearchTree.remove(5)
//console.log('-------------------------------------------------------------------------------')

//binarySearchTree.printTree();
//console.log(`This is the root value: ${binarySearchTree.root.data}`);
//console.log('-------------------------------------------------------------------------------')

