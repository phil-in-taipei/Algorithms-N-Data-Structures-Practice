from unittest import TestCase
from .symetric_difference import SymetricDifferences


class TestSymetricDifferences(TestCase):

    def setUp(self):
        self.test_1 = SymetricDifferences([1, 2, 3], [3, 4, 5])
        self.test_2 = SymetricDifferences([1, 2, 2, 3, 4], [2, 3, 3, 4, 5])
        self.test_3 = SymetricDifferences([1, 2, 3, 4], [1, 2, 3, 4])

    def test_get_unique_values(self):
        self.assertEqual(self.test_1.get_unique_values(), [1, 2, 4, 5])
        self.assertEqual(self.test_2.get_unique_values(), [1, 5])
        self.assertEqual(self.test_3.get_unique_values(), [])
