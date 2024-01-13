from unittest import TestCase
from .password_validator import PasswordValidator


class TestPasswordValidator(TestCase):

    def setUp(self):
        self.test_obj_1 = PasswordValidator("Abc12345")
        self.test_obj_2 = PasswordValidator("password123")
        self.test_obj_3 = PasswordValidator("Pass")
        self.test_obj_4 = PasswordValidator("HelloWorld")

    def test_string_is_a_valid_password(self):
        self.assertTrue(self.test_obj_1.string_is_a_valid_password())
        self.assertFalse(self.test_obj_2.string_is_a_valid_password())
        self.assertFalse(self.test_obj_3.string_is_a_valid_password())
        self.assertFalse(self.test_obj_4.string_is_a_valid_password())
