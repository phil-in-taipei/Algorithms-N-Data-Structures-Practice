const { Node, depthFirstTraversal } = require('./depth-first-traversal');

// Create a binary tree:      a
//                          /   \
//                         b     c
//                        / \    /
//                       d   e  f

const a = new Node("a");
const b = new Node("b");
const c = new Node("c");
const d = new Node("d");
const e = new Node("e");
const f = new Node("f");

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;
console.log('-------------------------------------------------------------------------------')
console.log('Created nodes and now ititializing depth first traversal object.....')
console.log('-------------------------------------------------------------------------------')
const dft = new depthFirstTraversal(a);
console.log('-------------------------------------------------------------------------------');
console.log('this is the result:')
console.log(dft);
console.log('-------------------------------------------------------------------------------')
