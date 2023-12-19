from unittest import TestCase
from .validate import Validate


class TestValidate(TestCase):

    def setUp(self):
        self.validation_result_1 = Validate("sweeney.phil@gmx.com")
        self.validation_result_2 = Validate("iamnotavalidemail")

    def test_validate_email(self):
        self.assertTrue(self.validation_result_1.validate_email())
        self.assertFalse(self.validation_result_2.validate_email())

