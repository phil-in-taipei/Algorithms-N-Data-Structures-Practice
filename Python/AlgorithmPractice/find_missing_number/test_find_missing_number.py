from unittest import TestCase
from find_missing_number import FindMissingNumber


class TestFindMissingNumber(TestCase):

    def setUp(self):
        self.test_obj1 = FindMissingNumber([1, 2, 3, 5, 6, 7, 8])
        self.test_obj2 = FindMissingNumber([])
        self.test_obj3 = FindMissingNumber([2, 1, 5, 3, 8, 7, 6, 10, 9])

    def test_get_verdict(self):
        self.assertEqual(self.test_obj1.get_missing_number(), 4.0)
        self.assertEqual(self.test_obj2.get_missing_number(), 1.0)
        self.assertEqual(self.test_obj3.get_missing_number(), 4.0)
