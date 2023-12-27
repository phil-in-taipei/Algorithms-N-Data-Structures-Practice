from unittest import TestCase
from .factorial import FactorialViaRecursion


class TestFactorialViaRecursion(TestCase):
    def setUp(self):
        self.test_object1 = FactorialViaRecursion(0)
        self.test_object2 = FactorialViaRecursion(5)
        self.test_object3 = FactorialViaRecursion(10)

    def test_get_of_number(self):
        self.assertEqual(0, self.test_object1.get_of_number())
        self.assertEqual(5, self.test_object2.get_of_number())
        self.assertEqual(10, self.test_object3.get_of_number())

    def test_get_output(self):
        self.assertEqual(1, self.test_object1.get_output())
        self.assertEqual(120, self.test_object2.get_output())
        self.assertEqual(3628800, self.test_object3.get_output())
