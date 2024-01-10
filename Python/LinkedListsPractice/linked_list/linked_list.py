
class Node:
    def __init__(self, data):
        self.next = None
        self.data = data

    def __str__(self):
        return f"Data: {self.data} linked to ${str(self.next)}"


class LinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
        self.max_size = 100

    def __str__(self):
        return f"Linked list with {self.max_size} nodes"

    def add(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            self.tail.next = new_node
        self.tail = new_node

    def contains(self, data):
        if self.head is not None:
            current_node = self.head
            while current_node.next is not None:
                if current_node.data == data:
                    return True
                current_node = current_node.next
        return False

    def get(self, index):
        current_node = self.head
        if current_node is not None and index >= 0:
            current_index = 0
            while current_index < index and current_node is not None:
                if current_node.next is not None:
                    current_node = current_node.next
                    current_index += 1
                else:
                    return None
            return current_node.data
        return None

    def insert_at(self, index, data):
        new_node = Node(data)
        if index ==0:
            new_node.next = self.head
            self.head = new_node
        else:
            previous_node = None
            current_node = self.head
            current_node_index = 0

            while current_node_index < index:
                previous_node = current_node
                current_node = current_node.next
                current_node_index += 1

            new_node.next = current_node
            previous_node.next = new_node

    def print_all(self):
        current_node = self.head
        while current_node is not None:
            #print(str(current_node))
            print(current_node.data)
            current_node = current_node.next

    def remove_from(self, index):
        if index == 0:
            if self.head.next is not None:
                self.head = self.head.next
            else:
                self.head = None
        else:
            previous_node = None
            current_node = self.head
            current_node_index = 0

            while current_node_index < index:
                previous_node = current_node
                current_node = current_node.next
                current_node_index += 1
            previous_node.next = current_node.next







