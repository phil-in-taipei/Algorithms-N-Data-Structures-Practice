from unittest import TestCase
from .calculate_number_to_power_of import PowerOfRecursive


class TestPowerOfRecursive(TestCase):

    def setUp(self):
        self.test_object1 = PowerOfRecursive(number=2, to_power_of=3)
        self.test_object2 = PowerOfRecursive(number=5, to_power_of=2)
        self.test_object3 = PowerOfRecursive(number=3, to_power_of=4)

    def test_get_number(self):
        self.assertEqual(2, self.test_object1.get_number())
        self.assertEqual(5, self.test_object2.get_number())
        self.assertEqual(3, self.test_object3.get_number())

    def test_get_to_power_of(self):
        self.assertEqual(3, self.test_object1.get_to_power_of())
        self.assertEqual(2, self.test_object2.get_to_power_of())
        self.assertEqual(4, self.test_object3.get_to_power_of())

    def test_get_result(self):
        self.assertEqual(8, self.test_object1.get_result())
        self.assertEqual(25, self.test_object2.get_result())
        self.assertEqual(81, self.test_object3.get_result())
