from unittest import TestCase
from .all_chars_unique import AllCharsAreUnique


class TestAllCharsAreUnique(TestCase):

    def setUp(self):
        self.test_obj1 = AllCharsAreUnique("bigbang")
        self.test_obj2 = AllCharsAreUnique("sunray")
        self.test_obj3 = AllCharsAreUnique("")
        
    def test_get_verdict(self):
        self.assertFalse(self.test_obj1.get_verdict())
        self.assertTrue(self.test_obj2.get_verdict())
        self.assertTrue(self.test_obj3.get_verdict())

