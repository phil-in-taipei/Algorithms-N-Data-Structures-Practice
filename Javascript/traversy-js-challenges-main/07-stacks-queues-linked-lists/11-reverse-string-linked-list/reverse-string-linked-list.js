//const { LinkedList } = require('./linked-list');
const { LinkedList } = require('../10-linked-list-implementation/linked-list');


function reverseStringLinkedList(string) {
    const list = new LinkedList();
    //list.setDebug();
    let reversedString = '';
    for (const char of string) {
        list.add(char);
    }
    for (let i = string.length - 1; i >= 0; i--) {
        reversedString += list.get(i);
    }
    return reversedString;
}

module.exports = reverseStringLinkedList;
