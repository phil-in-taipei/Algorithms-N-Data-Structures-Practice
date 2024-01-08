function findMiddle(linkedList) {
    let slowPointer = linkedList.head;
    let fastPointer = linkedList.head;
    let previous = null;

    while(fastPointer !== null && fastPointer.next !== null) {
        fastPointer = fastPointer.next.next;
        previous = slowPointer;
        slowPointer = slowPointer.next;
    }

    if (fastPointer === null) {
        return previous.next.data
    }
    return slowPointer.data;
}

module.exports = findMiddle;
