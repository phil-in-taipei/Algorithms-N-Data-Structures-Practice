from unittest import TestCase
from .array_of_numbers import ListOfNumbers


class TestListOfNumbers(TestCase):

    def setUp(self):
        self.test_list = [2, 1, 9, 9, 16, 10, 1]
        self.test_object = ListOfNumbers(self.test_list)

    def test_find_highest_number(self):
        print("Testing getting the highest value in a list of numbers")
        result = self.test_object.find_highest_number()
        self.assertEqual(result, 16)

    def test_remove_duplicates(self):
        print("Testing removing all duplicates from a list of numbers")
        result = self.test_object.remove_duplicates()
        self.assertEqual(result, [2, 1, 9, 16, 10])
