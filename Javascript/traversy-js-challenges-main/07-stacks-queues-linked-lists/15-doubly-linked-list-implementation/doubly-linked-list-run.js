const DoublyLinkedList = require('./doubly-linked-list');

const list = new DoublyLinkedList();

list.append(100);
list.append(200);
list.append(300);
list.prepend(50);
console.log('---------------------------------------------------------------------------')
list.printAll();
console.log('---------------------------------------------------------------------------')
list.insertAt(3, 250);
console.log('---------------------------------------------------------------------------')
list.printAll();
console.log('---------------------------------------------------------------------------')
list.remove(1);
list.printAll();
console.log('---------------------------------------------------------------------------')
console.log(`This is the data at index 2: ${list.get(2).data}`)
//list.printAll();
console.log('---------------------------------------------------------------------------')
console.log(`Contains 50: ${list.contains(50)}`);
console.log(`Contains 100: ${list.contains(100)}`);
console.log(`Contains 200: ${list.contains(200)}`);
console.log(`Contains 250: ${list.contains(250)}`);
console.log(`Contains 300: ${list.contains(300)}`);
