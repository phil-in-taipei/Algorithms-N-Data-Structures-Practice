from unittest import TestCase
from unittest.mock import patch
from .double_linked_list import DoublyLinkedList


class TestDoublyLinkedList(TestCase):

    def setUp(self):
        self.doubly_linked_list = DoublyLinkedList(10)
        self.doubly_linked_list.append(100)
        self.doubly_linked_list.append(200)

    def test_append(self):
        self.assertTrue(self.doubly_linked_list.append(300))
        self.assertEqual(self.doubly_linked_list.tail.data, 300)

    def test_get_length(self):
        self.assertEqual(self.doubly_linked_list.get_length(), 2)

    def test_get_max_size(self):
        self.assertEqual(self.doubly_linked_list.get_max_size(), 10)

    def test_get_data_at_index_or_null(self):
        self.assertFalse(self.doubly_linked_list.get_data_at_index_or_null(5))
        self.assertEqual(self.doubly_linked_list.get_data_at_index_or_null(1), 200)

    def test_insert_at(self):
        self.assertTrue(self.doubly_linked_list.insert_at(0, 50))
        self.assertEqual(self.doubly_linked_list.head.data, 50)

    def test_prepend(self):
        self.assertTrue(self.doubly_linked_list.prepend(20))
        self.assertEqual(self.doubly_linked_list.head.data, 20)

    def test_remove(self):
        self.assertTrue(self.doubly_linked_list.remove(1))
        self.assertNotEqual(self.doubly_linked_list.tail.data, 200)

    @patch('builtins.print')
    def test_print_all(self, mock_print):
        self.doubly_linked_list.print_all()
        mock_print.assert_called_with(200)

    @patch('builtins.print')
    def test_print_all_reverse(self, mock_print):
        self.doubly_linked_list.print_all_reverse()
        mock_print.assert_called_with(100)
