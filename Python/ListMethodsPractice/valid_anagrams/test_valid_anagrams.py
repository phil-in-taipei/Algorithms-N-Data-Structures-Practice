from unittest import TestCase
from .valid_anagrams import ValidAnagrams


class TestValidAnagrams(TestCase):

    def setUp(self):
        self.test_obj1 = ValidAnagrams('astronomer', 'moonstarer')
        self.test_obj2 = ValidAnagrams('listen', 'silent')
        self.test_obj3 = ValidAnagrams('apple', 'banana')

    def test_get_verdict(self):
        self.assertTrue(self.test_obj1.get_verdict())
        self.assertTrue(self.test_obj2.get_verdict())
        self.assertFalse(self.test_obj3.get_verdict())
