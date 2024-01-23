from queue import LifoQueue


class Traversal:
    def __init__(self):
        self.nodes_in_tree = []

    def get_depth_first(self, root_node):
        if root_node is None:
            return self.nodes_in_tree
        stack = LifoQueue(maxsize=100)
        stack.put(root_node)
        print(stack.qsize())
        while not stack.empty():
        #for i in range(10):
            print(stack.qsize())
            current_node = stack.get()
            print("This is the current node: " + str(current_node.data))
            print("This is the current stack size: " + str(stack.qsize()))
            self.nodes_in_tree.append(current_node)
            print("This is the current node -- right: ")
            print(current_node.right)
            print("This is the current node -- left: ")
            print(current_node.left)
            if current_node.right is not None:
                stack.put(current_node.right)
            if current_node.left is not None:
                stack.put(current_node.left)
        return self.nodes_in_tree
