from unittest import TestCase
from .array_of_numbers import ListOfNumbers


class TestListOfNumbers(TestCase):
    def test_find_highest_number(self):
        print("Testing getting the highest value in a list of numbers")
        obj = ListOfNumbers([2, 1, 9, 16, 10])
        result = obj.find_highest_number()
        self.assertEqual(result, 16)
