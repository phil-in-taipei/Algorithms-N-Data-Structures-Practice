from node.tree_node import TreeNode


class BinarySearchTree:
    def __init__(self):
        self.root = None

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
        self.recursively_print_tree_nodes(self.root)

    def recursively_print_tree_nodes(self, node):
        if node is None:
            return
        self.recursively_print_tree_nodes(node.left)
        print(node.data)
        self.recursively_print_tree_nodes(node.right)

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





