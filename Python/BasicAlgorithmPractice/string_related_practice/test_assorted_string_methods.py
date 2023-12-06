from unittest import TestCase
from .assorted_string_methods import AssortedStringPractice


class TestAssortedStringPractice(TestCase):

    def setUp(self):
        self.test_object_1 = AssortedStringPractice("A man, a plan, a canal, Panama")
        self.test_object_2 = AssortedStringPractice("Test objects are such a blast")

    def test_is_a_palindrome(self):
        result_1 = self.test_object_1.is_a_palindrome()
        self.assertTrue(result_1)
        result_2 = self.test_object_2.is_a_palindrome()
        self.assertFalse(result_2)

    def test_reverse_string(self):
        result = self.test_object_1.reverse_string()
        self.assertEquals(result, "amanaP ,lanac a ,nalp a ,nam")

    def test_title_case(self):
        result_1 = self.test_object_1.title_case()
        self.assertEquals(result_1, "A Man, A Plan, A Canal, Panama")
        result_2 = self.test_object_2.title_case()
        self.assertEquals(result_2, "Test Objects Are Such A Blast")
