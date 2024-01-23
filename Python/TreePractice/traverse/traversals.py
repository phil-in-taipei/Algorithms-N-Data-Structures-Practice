from queue import LifoQueue, Queue


class Traversal:
    def __init__(self, root_node):
        self.root_node = root_node
        self.nodes_in_tree = []

    def _reset_nodes_in_tree(self):
        self.nodes_in_tree = []

    def get_breadth_first(self):
        self._reset_nodes_in_tree()
        if self.root_node is None:
            return self.nodes_in_tree
        queue = Queue(100)
        queue.put(self.root_node)
        while not queue.empty():
            current_node = queue.get()
            self.nodes_in_tree.append(current_node)
            if current_node.left is not None:
                queue.put(current_node.left)
            if current_node.right is not None:
                queue.put(current_node.right)
        return self.nodes_in_tree

    def get_depth_first(self):
        self._reset_nodes_in_tree()
        if self.root_node is None:
            return self.nodes_in_tree
        stack = LifoQueue(maxsize=100)
        stack.put(self.root_node)
        while not stack.empty():
            current_node = stack.get()
            self.nodes_in_tree.append(current_node)
            if current_node.right is not None:
                stack.put(current_node.right)
            if current_node.left is not None:
                stack.put(current_node.left)
        return self.nodes_in_tree
