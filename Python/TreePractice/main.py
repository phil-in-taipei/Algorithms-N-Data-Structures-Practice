from node.tree_node import TreeNode
from traverse.traversals import Traversal


if __name__ == '__main__':
    print('----------------------------------------------------------------------')
    print('Implementing tree nodes:')
    a = TreeNode("a")
    b = TreeNode("b")
    c = TreeNode("c")
    d = TreeNode("d")
    e = TreeNode("e")
    f = TreeNode("f")
    g = TreeNode("g")
    print('---------------------------------------------------------------------------')
    print('Creating hierarchical left/right relations')

    a.set_left(b)
    a.set_right(c)
    b.set_left(d)
    b.set_right(e)
    c.set_right(g)
    c.set_left(f)
    print('This is the left node:')
    print(a.left.data)
    print('---------------------------------------------------------------------------')
    print('Initializing Traversal object with a node as the root')
    traversal_obj = Traversal()
    results = traversal_obj.get_depth_first(a)
    results_data = [result.data for result in results]
    print('---------------------------------------------------------------------------')
    print(F"This is the output of a depth-first traversal: {results_data}")
    print('---------------------------------------------------------------------------')

