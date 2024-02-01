const { LinkedList } = require('./linked-list');

console.log('--------------------------------------------------------------------------------------------------------------')
console.log('Implementing a linked list')
const linkedList = new LinkedList();
console.log('--------------------------------------------------------------------------------------------------------------')
linkedList.add(100);
linkedList.add(200);
linkedList.add(300);
console.log('--------------------------------------------------------------------------------------------------------------')
linkedList.printAll();
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(`It contains 800: ${linkedList.contains(800)}`);
console.log(`Node with 800: ${linkedList.get(800)?.data ? linkedList.get(800).getData() : null}`)
console.log(`It contains 200: ${linkedList.contains(200)}`);
console.log(`Node with 200: ${linkedList.get(200)?.getData()}`);
console.log(`Node with 200: ${linkedList.get(200)?.data ? linkedList.get(200).getData() : null}`)
console.log('--------------------------------------------------------------------------------------------------------------')
console.log("Inserting.....")
linkedList.insertAt(3, 150);
console.log('--------------------------------------------------------------------------------------------------------------')
linkedList.printAll();
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(linkedList.tail)
console.log(`This is the node at index 1`);
console.log('--------------------------------------------------------------------------------------------------------------')
const index1 = linkedList.getAtIndex(1);
console.log(index1?.getData());
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(`Removing: index 2`);
linkedList.removeAt(2);
console.log('--------------------------------------------------------------------------------------------------------------')
linkedList.printAll();
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(linkedList.tail);
console.log('--------------------------------------------------------------------------------------------------------------')
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(`Removing: index 2`);
linkedList.removeAt(2);
console.log('--------------------------------------------------------------------------------------------------------------')
linkedList.printAll();
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(linkedList.tail);
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(`Adding one more to the end: 400`);
linkedList.add(400)
console.log(`And removing index 0`);
linkedList.removeAt(0);
console.log('--------------------------------------------------------------------------------------------------------------')
linkedList.printAll();
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(linkedList.head);
console.log('--------------------------------------------------------------------------------------------------------------')
console.log(`This is the node at index 0`);
console.log('--------------------------------------------------------------------------------------------------------------')
const head = linkedList.getAtIndex(0);
console.log(head?.getData())
console.log('--------------------------------------------------------------------------------------------------------------');
console.log(`This is the node at index 1`);
const tail = linkedList.getAtIndex(1);
console.log(tail?.getData())
console.log('--------------------------------------------------------------------------------------------------------------');
console.log(`This is the node at index 2`);
const nonExistant = linkedList.getAtIndex(2);
console.log(nonExistant ? nonExistant?.getData() : null)

console.log('--------------------------------------------------------------------------------------------------------------');
export {}