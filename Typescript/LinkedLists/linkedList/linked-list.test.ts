const { ListNode, LinkedList } = require('./linked-list');

describe('LinkedList', () => {
  let linkedList: LinkedList;

  beforeEach(() => {
    linkedList = new LinkedList();
  });

  describe('add', () => {
    test('should add a node to the end of a non-empty list', () => {
      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);

      expect(linkedList.head).toBeTruthy();
      expect(linkedList.head?.getData()).toEqual(1);
      expect(linkedList.head?.getNext()?.getData()).toEqual(2);
      expect(linkedList.tail?.getData()).toEqual(3);
      expect(linkedList.tail).toBeTruthy();
    });
  });

  describe('printAll', () => {
    test('should print all nodes in the list', () => {
      const consoleSpy = jest.spyOn(console, 'log');

      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);

      linkedList.printAll();

      expect(consoleSpy).toHaveBeenCalledWith(1);
      expect(consoleSpy).toHaveBeenCalledWith(2);
      expect(consoleSpy).toHaveBeenCalledWith(3);

      consoleSpy.mockRestore();
    });
  });
  /*
  describe('get', () => {
    test('should get a single node at a specific index', () => {
      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);

      expect(linkedList.get(0)).toBe(1);
      expect(linkedList.get(1)).toBe(2);
      expect(linkedList.get(2)).toBe(3);
    });
  });
  */

  describe('insertAt', () => {
    test('should insert a node at the beginning of the list', () => {
      linkedList.add(2);
      linkedList.add(3);

      linkedList.insertAt(0, 1);

      expect(linkedList.head).toBeTruthy();
      expect(linkedList.head?.getData()).toEqual(1);
      expect(linkedList.head?.getNext()?.getData()).toEqual(2);
      expect(linkedList.tail?.getData()).toEqual(3);

    });

    test('should insert a node at a specific index', () => {
      linkedList.add(1);
      linkedList.add(3);
      linkedList.add(4);

      linkedList.insertAt(1, 2);

      expect(linkedList.head).toBeTruthy();
      expect(linkedList.head?.getData()).toEqual(1);
      expect(linkedList.head?.getNext()?.getData()).toEqual(2);
      expect(linkedList.head?.getNext()?.getNext()?.getData()).toEqual(3);
      expect(linkedList.tail?.getData()).toEqual(4);
    });
  });
  /*
  describe('removeFrom', () => {
    test('should remove a node from the beginning of the list', () => {
      linkedList.add(1);
      linkedList.add(2);
      linkedList.add('3);

      linkedList.removeFrom(0);

      expect(linkedList.head.data).toEqual('B');
    });

    test('should remove a node from a specific index', () => {
      linkedList.add(1);
      linkedList.add(2);
      linkedList.add(3);
      linkedList.add(4);

      linkedList.removeFrom(1);

      expect(linkedList.head.data).toEqual('A');
      expect(linkedList.head.next.data).toEqual('C');
      expect(linkedList.tail.data).toEqual('D');
    });
  });
  */
});

export {}