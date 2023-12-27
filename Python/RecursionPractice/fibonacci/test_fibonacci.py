from unittest import TestCase
from .fibonacci import FibonacciViaRecursion


class TestFibonacciViaRecursion(TestCase):

    def setUp(self):
        self.test_object1 = FibonacciViaRecursion(4)
        self.test_object2 = FibonacciViaRecursion(5)
        self.test_object3 = FibonacciViaRecursion(6)

    def test_get_sequence_index(self):
        self.assertEqual(4, self.test_object1.get_sequence_index())
        self.assertEqual(5, self.test_object2.get_sequence_index())
        self.assertEqual(6, self.test_object3.get_sequence_index())

    def test_get_value_at_index(self):
        self.assertEqual(3, self.test_object1.get_value_at_index())
        self.assertEqual(5, self.test_object2.get_value_at_index())
        self.assertEqual(8, self.test_object3.get_value_at_index())

