from unittest import TestCase
from .find_occurences import FindOccurrences


class TestFindOccurrences(TestCase):
    def test_get_number(self):
        print("Testing getting the number of occurrences of a character in a string")
        obj = FindOccurrences("hellLo World", 'l')
        result = obj.get_number()
        self.assertEqual(result, 3)


