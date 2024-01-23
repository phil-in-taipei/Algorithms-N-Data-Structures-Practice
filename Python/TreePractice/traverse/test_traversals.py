from unittest import TestCase
from node.tree_node import TreeNode
from .traversals import Traversal


class TestTraversal(TestCase):

    def setUp(self):
        self.a = TreeNode("a")
        self.b = TreeNode("b")
        self.c = TreeNode("c")
        self.d = TreeNode("d")
        self.e = TreeNode("e")
        self.f = TreeNode("f")
        self.g = TreeNode("g")

        self.a.set_left(self.b)
        self.a.set_right(self.c)
        self.b.set_left(self.d)
        self.b.set_right(self.e)
        self.c.set_right(self.g)
        self.c.set_left(self.f)

        self.test_traversal_obj = Traversal(self.a)

    def test_get_breadth_first(self):
        results = self.test_traversal_obj.get_breadth_first()
        results_data = [result.data for result in results]
        self.assertEqual(
            str(results_data),
            "['a', 'b', 'c', 'd', 'e', 'f', 'g']"
        )

    def test_get_depth_first(self):
        results = self.test_traversal_obj.get_depth_first()
        results_data = [result.data for result in results]
        self.assertEqual(
            str(results_data),
            "['a', 'b', 'd', 'e', 'c', 'f', 'g']"
        )
