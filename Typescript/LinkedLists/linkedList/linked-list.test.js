"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const { ListNode, LinkedList } = require('./linked-list');
describe('LinkedList', () => {
    let linkedList;
    beforeEach(() => {
        linkedList = new LinkedList();
    });
    describe('add', () => {
        test('should add a node to the end of a non-empty list', () => {
            var _a, _b, _c, _d;
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            expect(linkedList.head).toBeTruthy();
            expect((_a = linkedList.head) === null || _a === void 0 ? void 0 : _a.getData()).toEqual(1);
            expect((_c = (_b = linkedList.head) === null || _b === void 0 ? void 0 : _b.getNext()) === null || _c === void 0 ? void 0 : _c.getData()).toEqual(2);
            expect((_d = linkedList.tail) === null || _d === void 0 ? void 0 : _d.getData()).toEqual(3);
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
    describe('get', () => {
        test('should get a single node at a specific index', () => {
            var _a, _b, _c;
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            expect((_a = linkedList.get(1)) === null || _a === void 0 ? void 0 : _a.getData()).toEqual(1);
            expect((_b = linkedList.get(2)) === null || _b === void 0 ? void 0 : _b.getData()).toEqual(2);
            expect((_c = linkedList.get(3)) === null || _c === void 0 ? void 0 : _c.getData()).toEqual(3);
        });
    });
    describe('getAtIndex', () => {
        test('should get a single node at a specific index', () => {
            var _a, _b, _c;
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            expect((_a = linkedList.getAtIndex(0)) === null || _a === void 0 ? void 0 : _a.getData()).toEqual(1);
            expect((_b = linkedList.getAtIndex(1)) === null || _b === void 0 ? void 0 : _b.getData()).toEqual(2);
            expect((_c = linkedList.getAtIndex(2)) === null || _c === void 0 ? void 0 : _c.getData()).toEqual(3);
            expect(linkedList.getAtIndex(3)).toBeFalsy();
        });
    });
    describe('insertAt', () => {
        test('should insert a node at the beginning of the list', () => {
            var _a, _b, _c, _d;
            linkedList.add(2);
            linkedList.add(3);
            linkedList.insertAt(0, 1);
            expect(linkedList.head).toBeTruthy();
            expect((_a = linkedList.head) === null || _a === void 0 ? void 0 : _a.getData()).toEqual(1);
            expect((_c = (_b = linkedList.head) === null || _b === void 0 ? void 0 : _b.getNext()) === null || _c === void 0 ? void 0 : _c.getData()).toEqual(2);
            expect((_d = linkedList.tail) === null || _d === void 0 ? void 0 : _d.getData()).toEqual(3);
        });
        test('should insert a node at a specific index', () => {
            var _a, _b, _c, _d, _e, _f, _g;
            linkedList.add(1);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.insertAt(1, 2);
            expect(linkedList.head).toBeTruthy();
            expect((_a = linkedList.head) === null || _a === void 0 ? void 0 : _a.getData()).toEqual(1);
            expect((_c = (_b = linkedList.head) === null || _b === void 0 ? void 0 : _b.getNext()) === null || _c === void 0 ? void 0 : _c.getData()).toEqual(2);
            expect((_f = (_e = (_d = linkedList.head) === null || _d === void 0 ? void 0 : _d.getNext()) === null || _e === void 0 ? void 0 : _e.getNext()) === null || _f === void 0 ? void 0 : _f.getData()).toEqual(3);
            expect((_g = linkedList.tail) === null || _g === void 0 ? void 0 : _g.getData()).toEqual(4);
        });
    });
    describe('removeAt', () => {
        test('should remove a node from the beginning of the list', () => {
            var _a;
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.removeAt(0);
            expect((_a = linkedList.head) === null || _a === void 0 ? void 0 : _a.getData()).toEqual(2);
        });
        test('should remove a node from a specific index', () => {
            var _a, _b, _c, _d;
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            linkedList.removeAt(1);
            expect((_a = linkedList.head) === null || _a === void 0 ? void 0 : _a.data).toEqual(1);
            expect((_c = (_b = linkedList.head) === null || _b === void 0 ? void 0 : _b.next) === null || _c === void 0 ? void 0 : _c.getData()).toEqual(3);
            expect((_d = linkedList.tail) === null || _d === void 0 ? void 0 : _d.getData()).toEqual(4);
        });
    });
});
