const { Node, isValidBST } = require('./validate-bst');

// Create the binary tree:
//       8
//      / \
//     4   10
//    / \
//   2   6
const root = new Node(8);
const four = new Node(4);
const ten = new Node(10);

root.left = four;
root.right = ten;

const two = new Node(2);
const six = new Node(6);

four.left = two;
four.right = six;
console.log('-------------------------------------------------------------------------------------------')
const result = isValidBST(root);
console.log('-------------------------------------------------------------------------------------------')
console.log(`It is a valid bst: ${result}`);
console.log('-------------------------------------------------------------------------------------------')
