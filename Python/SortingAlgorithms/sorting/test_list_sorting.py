from unittest import TestCase
from .list_sorting import SortList


class TestSortList(TestCase):

    def setUp(self):
        self.test1 = SortList([3, 9, 2, 7, 1, 4, 6, 8, 5])
        self.test2 = SortList(['c', 'i', 'b', 'g', 'd', 'f', 'h', 'e'])

    def test_bubble_sort(self):
        self.assertEqual(self.test1.bubble_sort(), [1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(self.test2.bubble_sort(), ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])

    def test_insertion_sort(self):
        self.assertEqual(self.test1.insertion_sort(), [1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(self.test2.insertion_sort(), ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])

    def test_merge_sort_result(self):
        self.assertEqual(self.test1.merge_sort_result(),[1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(self.test2.merge_sort_result(), ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])

    def test_quick_sort_result(self):
        self.assertEqual(self.test1.quick_sort_result(), [1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(self.test2.quick_sort_result(), ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])

    def test_selection_sort(self):
        self.assertEqual(self.test1.selection_sort(), [1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(self.test2.selection_sort(), ['b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'])
