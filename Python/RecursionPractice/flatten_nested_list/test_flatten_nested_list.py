from unittest import TestCase
from .flatten_nested_list import FlattenNestedList


class TestFlattenNestedList(TestCase):

    def setUp(self):
        self.test_class = FlattenNestedList()

    def test_get_flattened_list(self):
        self.assertEqual(
            [1, 2, 3, 4, 5, 6, 7, 8, 9],
            self.test_class.get_flattened_list([1, [2, 3, 4], [5, 6], 7, [8, 9]])
        )
