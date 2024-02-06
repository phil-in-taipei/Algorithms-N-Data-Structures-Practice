from unittest import TestCase
from .graph import Graph
from .traversals import GraphTraversals


class TestGraphTraversals(TestCase):

    def setUp(self):
        self.test1 = Graph()
        self.test1.add_vertex("A")
        self.test1.add_vertex("B")
        self.test1.add_vertex("C")
        self.test1.add_vertex("D")
        self.test1.add_vertex("E")
        self.test1.add_vertex("F")
        self.test1.add_vertex("G")

        self.test1.add_edge('A', 'B')
        self.test1.add_edge('A', 'C')
        self.test1.add_edge('B', 'D')
        self.test1.add_edge('C', 'E')
        self.test1.add_edge('D', 'E')
        self.test1.add_edge('D', 'F')
        self.test1.add_edge('E', 'G')
        self.test1.add_edge('F', 'G')

        self.test_traversal = GraphTraversals(self.test1, "A")

    def test_get_depth_first(self):
        self.assertEqual(
            str(self.test_traversal.get_depth_first().sort()),
            str(['A', 'C', 'E', 'G', 'F', 'D', 'B'].sort())
        )

    def test_get_breadth_first(self):
        self.assertEqual(
            str(self.test_traversal.get_breadth_first().sort()),
            str(['C', 'A', 'F', 'D', 'G', 'E', 'B'].sort())
        )
