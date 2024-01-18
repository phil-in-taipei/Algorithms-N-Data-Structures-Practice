const { Node, depthFirstTraversal } = require('./depth-first-traversal');

// Create a binary tree:      a
//                          /   \
//                         b     c
//                        / \    |\
//                       /   \   | \
//                      |     |   \  \
//                      d     e    f   g
//                     / \   / \   /\  |\
//                    h   i j  k  l m  n  o
//
const a = new Node("a");
const b = new Node("b");
const c = new Node("c");
const d = new Node("d");
const e = new Node("e");
const f = new Node("f");
const g = new Node("g");
const h = new Node("h");
const i = new Node("i");
const j = new Node("j");
const k = new Node("k");
const l = new Node("l");
const m = new Node("m");
const n = new Node("m");
const o = new Node("o");





a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = g;
c.left = f;
d.right = i;
d.left = h;
e.left = j;
e.right = k;
f.left = l;
f.right = m;
g.left = n;
g.right = o;
console.log('-------------------------------------------------------------------------------')
console.log('Created nodes and now ititializing depth first traversal object.....')
console.log('-------------------------------------------------------------------------------')
const dft = new depthFirstTraversal(a);
console.log('-------------------------------------------------------------------------------');
console.log('this is the result:')
console.log(dft);
console.log('-------------------------------------------------------------------------------')
