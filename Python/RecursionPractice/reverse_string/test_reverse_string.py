from unittest import TestCase

from .reverse_string import RecursivelyReverseString


class TestRecursivelyReverseString(TestCase):

    def setUp(self):
        self.test_object1 = RecursivelyReverseString("hello")
        self.test_object2 = RecursivelyReverseString("javascript")
        self.test_object3 = RecursivelyReverseString("python")

    def test_get_output(self):
        self.assertEqual(self.test_object1.get_output(), "olleh")
        self.assertEqual(self.test_object2.get_output(), "tpircsavaj")
        self.assertEqual(self.test_object3.get_output(), "nohtyp")
