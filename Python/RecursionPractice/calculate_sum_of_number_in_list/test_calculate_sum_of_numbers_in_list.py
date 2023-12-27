from unittest import TestCase
from .calculate_sum_of_numbers_in_list import CalculateSumOfListNumbersRecursively


class TestCalculateSumOfListNumbersRecursively(TestCase):

    def setUp(self):
        self.test_obj1 = CalculateSumOfListNumbersRecursively([1, 2, 3, 4, 5])
        self.test_obj2 = CalculateSumOfListNumbersRecursively([-1, -2, -3, -4, -5])
        self.test_obj3 = CalculateSumOfListNumbersRecursively([])

    def test_get_sum(self):
        self.assertEqual(15, self.test_obj1.get_sum())
        self.assertEqual(-15, self.test_obj2.get_sum())
        self.assertEqual(0, self.test_obj3.get_sum())

