const DoublyLinkedList = require('../15-doubly-linked-list-implementation/doubly-linked-list');

function findPairSum(nums, targetSum) {
    const doublyLinkedList = new DoublyLinkedList();
    for (const item of nums) {
        const complement = targetSum - item;
        if (doublyLinkedList.contains(complement) === true) {
            return [item, complement];
        }
        doublyLinkedList.append(item);
    }

    return []
}

module.exports = findPairSum;
