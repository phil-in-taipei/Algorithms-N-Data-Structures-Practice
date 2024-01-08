//const { LinkedList } = //require('./linked-list-solution')//require('./linked-list');
const { LinkedList } = require('./linked-list');

console.log('----------------------------------------------------------------')
console.log('----------------------------------------------------------------')


const list = new LinkedList();
//list.setDebug();

list.add(100);
console.log('----------------------------------------------------------------')
list.add(200);
console.log('----------------------------------------------------------------')

list.add(300); 
console.log('----------------------------------------------------------------')

list.add(400);
console.log('----------------------------------------------------------------')

list.printAll();

console.log('----------------------------------------------------------------')
const node = list.get(3)
if (node) {
    console.log(`This is node at index 3: ${node}`)
} else {
    console.log('No node at index 3')
}
console.log('----------------------------------------------------------------')

console.log(`Now inserting item 'a' at index 2`)
console.log('----------------------------------------------------------------')
list.insertAt(2, 'a');

console.log('----------------------------------------------------------------')
list.printAll();
console.log('----------------------------------------------------------------')
console.log("Now removing item from index 3")
console.log('----------------------------------------------------------------')
list.removeFrom(3);

console.log('----------------------------------------------------------------')

list.turnOffDebug();
list.printAll();
// below was testing the original method

/*
console.log('----------------------------------------------------------------')
console.log('Now initializing an empty linked list')
const list2 = new LinkedList();
list2.setDebug();
console.log('----------------------------------------------------------------')
const node2 = list2.get(3)
if (node) {
    console.log(`This is node at index 3: ${node2.data}`)
} else {
    console.log('No node at index 3')
}
*/
console.log('----------------------------------------------------------------')
