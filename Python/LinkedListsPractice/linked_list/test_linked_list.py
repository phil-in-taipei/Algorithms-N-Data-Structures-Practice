from unittest import TestCase
from unittest.mock import patch
from .linked_list import LinkedList


class TestLinkedList(TestCase):

    def setUp(self):
        self.linked_list = LinkedList()
        self.linked_list.add(100)
        self.linked_list.add(200)

    def test_add(self):
        self.linked_list.add(300)
        self.assertEqual(self.linked_list.tail.data, 300)

    def test_contains(self):
        self.assertTrue(self.linked_list.contains(100))

    def test_get(self):
        self.assertEqual(self.linked_list.get(1), 200)

    def test_insert_at(self):
        self.linked_list.insert_at(0, 50)
        self.assertEqual(self.linked_list.head.data, 50)

    @patch('builtins.print')
    def test_print_all(self, mock_print):
        self.linked_list.print_all()
        mock_print.assert_called_with(200)

    def test_remove_from(self):
        self.linked_list.remove_from(1)
        self.assertFalse(self.linked_list.contains(200))
