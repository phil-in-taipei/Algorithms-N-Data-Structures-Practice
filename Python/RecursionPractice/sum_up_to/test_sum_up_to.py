from unittest import TestCase
from .sum_up_to import CumulativeSumUpToNumber


class TestCumulativeSumUpToNumber(TestCase):

        def setUp(self):
            self.test_object1 = CumulativeSumUpToNumber(3)
            self.test_object2 = CumulativeSumUpToNumber(6)
            self.test_object3 = CumulativeSumUpToNumber(10)

        def test_output(self):
            self.assertEqual(self.test_object1.get_value(), 6)
            self.assertEqual(self.test_object2.get_value(), 21)
            self.assertEqual(self.test_object3.get_value(), 55)
