from unittest import TestCase
from .graph import Graph


class TestGraph(TestCase):

    def setUp(self):
        self.test1 = Graph()
        self.test1.add_vertex("Washington")

    def test_add_vertex(self):
        self.test1.add_vertex("New York")
        self.assertTrue("New York" in list(self.test1.adjacencyListDict.keys()))

    def test_add_edge(self):
        self.test1.add_vertex("New York")
        self.test1.add_edge("Washington", "New York")
        self.assertTrue("New York" in list(self.test1.adjacencyListDict.keys()))
        self.assertTrue("Washington" in list(self.test1.adjacencyListDict.keys()))
        self.assertTrue("New York" in self.test1.adjacencyListDict['Washington'])
        self.assertTrue("Washington" in self.test1.adjacencyListDict['New York'])

    def test_remove_edge(self):
        self.test1.add_vertex("New York")
        self.test1.add_edge("Washington", "New York")
        self.test1.remove_edge("New York", "Washington")
        self.assertFalse("New York" in self.test1.adjacencyListDict['Washington'])
        self.assertFalse("Washington" in self.test1.adjacencyListDict['New York'])

    def test_remove_vertex(self):
        self.test1.add_vertex("New York")
        self.test1.add_edge("Washington", "New York")
        self.test1.remove_vertex("Washington")
        self.assertFalse("Washington" in list(self.test1.adjacencyListDict.keys()))
        self.assertFalse("Washington" in self.test1.adjacencyListDict['New York'])


