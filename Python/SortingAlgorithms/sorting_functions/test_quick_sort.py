from unittest import TestCase
from .quick_sort import quick_sort


class Test(TestCase):
    def test_quick_sort(self):
        self.assertEqual(
            quick_sort([89899, 931, 1222, 19, 398391, 8998, 230, 0, 40]),
            [0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]
        )
        self.assertEqual(
            quick_sort([5, 2, 8, 1, 3]),
            [1, 2, 3, 5, 8]
        )
        self.assertEqual(
            quick_sort([4, 1, 3, 4, 2, 2]),
            [1, 2, 2, 3, 4, 4]
        )

