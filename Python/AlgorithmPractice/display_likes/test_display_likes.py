from unittest import TestCase
from .display_likes import DisplayLikes


class TestDisplayLikes(TestCase):

    def setUp(self):
        self.test_obj_1 = DisplayLikes(["Bob"])
        self.test_obj_2 = DisplayLikes(["Bob", "Alice"])
        self.test_obj_3 = DisplayLikes(["Bob", "Alice", "Dana"])
        self.test_obj_4 = DisplayLikes(["Bob", "Alice", "Dana", "Louisa"])
        self.test_obj_5 = DisplayLikes([])
        self.test_result1 = "Bob likes this"
        self.test_result2 = "Bob and Alice like this"
        self.test_result3 = "Bob, Alice and Dana like this"
        self.test_result4 = "Bob, Alice and 2 other users like this"
        self.test_result5= "Nobody likes this"

    def test_get_message(self):
        self.assertEqual(self.test_obj_1.get_message(), self.test_result1)
        self.assertEqual(self.test_obj_2.get_message(), self.test_result2)
        self.assertEqual(self.test_obj_3.get_message(), self.test_result3)
        self.assertEqual(self.test_obj_4.get_message(), self.test_result4)
        self.assertEqual(self.test_obj_5.get_message(), self.test_result5)


