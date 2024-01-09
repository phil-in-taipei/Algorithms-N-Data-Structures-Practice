const DoublyLinkedList = require('./doubly-linked-list');

const list = new DoublyLinkedList();

list.append(100);
list.append(200);
list.append(300);
list.prepend(50);
console.log('---------------------------------------------------------------------------')
list.printAll();
console.log('---------------------------------------------------------------------------')
list.insert(3, 250);
console.log('---------------------------------------------------------------------------')
list.printAll();
console.log('---------------------------------------------------------------------------')
list.remove(0);
list.printAll();
console.log('---------------------------------------------------------------------------')
//list.printAll();
console.log('---------------------------------------------------------------------------')

