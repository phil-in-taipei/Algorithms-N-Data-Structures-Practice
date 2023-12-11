from unittest import TestCase
from .fizzbuzz import Fizzbuzz


class TestFizzbuzz(TestCase):
    def setUp(self):
        self.test_result_list = [
            1, 2, 'fizz', 4, 'buzz',
            'fizz', 7, 8,
            'fizz', 'buzz', 11,
            'fizz', 13, 14, 'fizzbuzz'
        ]

    def test_get_fizzbuzz(self):
        test_object = Fizzbuzz(15)
        print("Testing fizz buzz up to 15")
        result = test_object.get_fizzbuzz()
        self.assertEqual(result, self.test_result_list)
