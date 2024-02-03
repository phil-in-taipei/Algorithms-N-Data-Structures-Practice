from unittest import TestCase
from bubble_sort import bubble_sort1, bubble_sort2


class Test(TestCase):
    def test_bubble_sort1(self):
        self.assertEqual(
            bubble_sort1([89899, 931, 1222, 19, 398391, 8998, 230, 0, 40]),
            [0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]
        )
        self.assertEqual(
            bubble_sort1([5, 2, 8, 1, 3]),
            [1, 2, 3, 5, 8]
        )
        self.assertEqual(
            bubble_sort1([4, 1, 3, 4, 2, 2]),
            [1, 2, 2, 3, 4, 4]
        )

    def test_bubble_sort2(self):
        self.assertEqual(
            bubble_sort2([89899, 931, 1222, 19, 398391, 8998, 230, 0, 40]),
            [0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]
        )
        self.assertEqual(
            bubble_sort2([5, 2, 8, 1, 3]),
            [1, 2, 3, 5, 8]
        )
        self.assertEqual(
            bubble_sort2([4, 1, 3, 4, 2, 2]),
            [1, 2, 2, 3, 4, 4]
        )
