from unittest import TestCase
from .binary_search_tree import BinarySearchTree
from unittest.mock import patch


class TestBinarySearchTree(TestCase):

    def setUp(self):
        self.test_obj = BinarySearchTree()

    def test_get_count(self):
        self.test_obj.insert(10)
        self.test_obj.insert(5)
        self.assertEqual(self.test_obj.get_count(), 2)

    def test_insert(self):
        self.test_obj.insert(10)
        self.test_obj.insert(5)
        self.test_obj.insert(15)
        self.test_obj.insert(2)
        self.assertEqual( self.test_obj.root.data, 10)
        self.assertEqual( self.test_obj.root.left.data, 5)
        self.assertEqual( self.test_obj.root.right.data, 15)
        self.assertEqual( self.test_obj.root.left.left.data, 2)

    def test_lookup(self):
        self.test_obj.insert(10)
        self.test_obj.insert(5)
        self.test_obj.insert(15)
        self.assertEqual(self.test_obj.lookup(5).data, 5)

    @patch('builtins.print')
    def test_print_tree(self, mock_print):
        self.test_obj.insert(10)
        self.test_obj.insert(5)
        self.test_obj.print_tree()
        mock_print.assert_called_with(10)

    def test_remove(self):
        self.test_obj.insert(10)
        self.test_obj.insert(5)
        self.test_obj.insert(15)
        self.test_obj.remove(5)
        self.assertEqual(self.test_obj.lookup(5), None)

    def test_remove_overloaded(self):
        self.test_obj.insert(10)
        self.test_obj.insert(5)
        self.test_obj.insert(15)
        self.test_obj.remove_overloaded(removal_data=5)
        self.assertEqual(self.test_obj.lookup(5), None)

