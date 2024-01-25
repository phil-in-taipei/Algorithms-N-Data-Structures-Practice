from node.tree_node import TreeNode
from queue import Queue


class BinarySearchTree:
    def __init__(self):
        self.root = None

    # uses breadth first traversal to count the number of nodes
    def get_count(self):
        number_of_nodes = 0
        if self.root is None:
            return number_of_nodes
        queue = Queue(100)
        queue.put(self.root)
        while not queue.empty():
            current_node = queue.get()
            number_of_nodes += 1
            if current_node.left is not None:
                queue.put(current_node.left)
            if current_node.right is not None:
                queue.put(current_node.right)
        return number_of_nodes

    def insert(self, data):
        new_node = TreeNode(data)
        if self.root is None:
            self.root = new_node
        else:
            current_node = self.root
            while True:
                if new_node.data < current_node.data:
                    if current_node.left is None:
                        current_node.left = new_node
                        return self
                    current_node = current_node.left
                else:
                    if current_node.right is None:
                        current_node.right = new_node
                        return self
                    current_node = current_node.right

    def lookup(self, data):
        if self.root is None:
            return None
        else:
            current_node = self.root
            while current_node is not None:
                if data < current_node.data:
                    current_node = current_node.left
                elif data > current_node.data:
                    current_node = current_node.right
                elif data == current_node.data:
                    return current_node
            return None

    def print_tree(self):
        self._recursively_print_tree_nodes(self.root)

    def _recursively_print_tree_nodes(self, node):
        if node is None:
            return
        self._recursively_print_tree_nodes(node.left)
        print(node.data)
        self._recursively_print_tree_nodes(node.right)

    # uses a function wrapped inside the method, which is called recursively
    # doesn't return output to the user
    def remove(self, data):
        def recursively_remove_node(node, removal_data):
            if node is None:
                return None
            if removal_data < node.data:
                node.left = recursively_remove_node(node.left, removal_data)
                return node
            elif removal_data > node.data:
                node.right = recursively_remove_node(node.right, removal_data)
                return node
            else:
                if node.left is None:
                    return node.right
                elif node.right is None:
                    return node.left
                temporary_node = node.right
                while temporary_node.left is not None:
                    temporary_node = temporary_node.left
                node.data = temporary_node.data
                node.right = recursively_remove_node(node.right, removal_data=temporary_node.data)
                return node
        self.root = recursively_remove_node(self.root, removal_data=data)

    # overloaded and is called recursively -- the node keyword argument is optional
    # so it will initially be called only with the removal data and not with a node
    # once inside the method, if the node argument is missing, then the recursive
    # process will be called for the first time -- doesn't return output to the user
    def remove_overloaded(self, **kwargs):
        removal_data = kwargs['removal_data']
        if 'node' in kwargs:
            node = kwargs['node']
            if node is None:
                return None
            if removal_data < node.data:
                node.left = self.remove_overloaded(node=node.left, removal_data=removal_data)
                return node
            elif removal_data > node.data:
                node.right = self.remove_overloaded(node=node.right, removal_data=removal_data)
                return node
            else:
                if node.left is None:
                    return node.right
                elif node.right is None:
                    return node.left
                temporary_node = node.right
                while temporary_node.left is not None:
                    temporary_node = temporary_node.left
                node.data = temporary_node.data
                node.right = self.remove_overloaded(node=node.right, removal_data=temporary_node.data)
                return node
        else:
            self.remove_overloaded(node=self.root, removal_data=removal_data)
