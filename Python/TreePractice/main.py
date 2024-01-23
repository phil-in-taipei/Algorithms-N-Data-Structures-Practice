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
    traversal_obj = Traversal(a)
    results1 = traversal_obj.get_depth_first()
    results_data1 = [result.data for result in results1]
    print('---------------------------------------------------------------------------')
    print(F"This is the output of a depth-first traversal: {results_data1}")
    print('---------------------------------------------------------------------------')
    results2 = traversal_obj.get_breadth_first()
    print(len(results2))
    results_data2 = [result.data for result in results2]
    print('---------------------------------------------------------------------------')
    print(F"This is the output of a breadth-first traversal: {results_data2}")
    print('---------------------------------------------------------------------------')

