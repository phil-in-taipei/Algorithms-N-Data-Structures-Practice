from unittest import TestCase
from .knapsack import get_knapsack_contents


class Test(TestCase):
    def test_get_knapsack_contents(self):
        items = [
            {"name": "A", "value": 5, "weight": 3},
            {"name": "B", "value": 3, "weight": 2},
            {"name": "C", "value": 4, "weight": 1}
        ]
        capacity = 4

        expected = {
            "Total Value": 9,
            "Knapsack Items": ["C", "A"],
            "Number of Leftover Items": 1
        }

        actual = get_knapsack_contents(items, capacity)
        self.assertDictEqual(expected, actual)


