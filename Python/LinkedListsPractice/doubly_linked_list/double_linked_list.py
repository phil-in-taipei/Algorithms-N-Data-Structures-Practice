
class DoublyLinkedNode:
    def __init__(self, data):
        self.previous = None
        self.next = None
        self.data = data

    def __str__(self):
        return f"Data: {self.data} linked to previous(${str(self.next)}) and next((${str(self.next)})"


class DoublyLinkedList:
    def __init__(self, max_size):
        self.head = None
        self.tail = None
        self.length = 0
        self.max_size = max_size

    def append(self, data):
        if self.get_remaining_space() > 0:
            new_node = DoublyLinkedNode(data)
            if self.length == 0:
                self.head = new_node
                self.tail = new_node
            else:
                self.tail.next = new_node
                new_node.previous = self.tail
                self.tail = new_node
            self.length += 1
            return True
        else:
            return False

    def get_length(self):
        return self.length

    def get_max_size(self):
        return self.max_size

    def get_data_at_index_or_null(self, index):
        if self.index_is_in_range_of_current_list(index) and self.head is not None:
            if self.index_is_in_first_half(index):
                node = self.iterate_forward_to_get_node(index)
                return node.data
            else:
                node = self.iterate_backwards_to_get_node(index)
                return node.data
        else:
            return None

    def get_remaining_space(self):
        return self.max_size - self.length

    def index_is_in_first_half(self, index):
        return index < self.length / 2

    def index_is_in_range_of_current_list(self, index):
        return 0 <= index < self.length

    def iterate_backwards_to_get_node(self, index):
        current_node = self.tail
        current_index = self.length - 1
        while current_index > index and current_node is not None:
            current_node = current_node.previous
            current_index -= 1
        return current_node

    def iterate_forward_to_get_node(self, index):
        current_node = self.head
        current_index = 0
        while current_index < index and current_node is not None:
            current_node = current_node.next
            current_index += 1
        return current_node

    def insert_at(self, index, data):
        if (self.index_is_in_range_of_current_list(index) or index == self.length) and self.get_remaining_space() > 0:
            if index == 0:
                self.prepend(data)
            elif index == self.length:
                self.append(data)
            else:
                new_node = DoublyLinkedNode(data)
                if self.index_is_in_first_half(index):
                    current_node = self.iterate_forward_to_get_node(index -1)
                else:
                    current_node = self.iterate_backwards_to_get_node(index - 1)
                new_node.next = current_node.next
                new_node.previous = current_node
                current_node.next.previous = new_node
                current_node.next = new_node
                self.length += 1
            return True
        else:
            return False

    def prepend(self, data):
        if self.get_remaining_space() > 0:
            new_node = DoublyLinkedNode(data)
            if self.length == 0:
                self.head = new_node
                self.tail = new_node
            else:
                self.head.previous = new_node
                new_node.next = self.head
                self.head = new_node
            self.length += 1
            return True
        else:
            return False

    def print_all(self):
        current_node = self.head
        while current_node is not None:
            print(current_node.data)
            current_node = current_node.next

    def print_all_reverse(self):
        current_node = self.tail
        while current_node is not None:
            print(current_node.data)
            current_node = current_node.previous

    def remove(self, index):
        if self.index_is_in_range_of_current_list(index):
            if index == 0:
                self.head = self.head.next
                if self.head is not None:
                    self.head.previous = None
                else:
                    self.tail = None
            elif index == self.length - 1:
                self.tail = self.tail.previous
                if self.tail is not None:
                    self.tail.next = None
                else:
                    self.head = None
            else:
                if self.index_is_in_first_half(index):
                    current_node = self.iterate_forward_to_get_node(index)
                else:
                    current_node = self.iterate_backwards_to_get_node(index)
                current_node.previous.next = current_node.next
                current_node.next.previous = current_node.previous
            self.length -= 1
            return True
        else:
            return False

