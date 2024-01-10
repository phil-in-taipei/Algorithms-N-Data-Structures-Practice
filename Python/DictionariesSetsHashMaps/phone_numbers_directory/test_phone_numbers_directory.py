from unittest import TestCase
from .phone_numbers_directory import PhoneNumbersDirectory


class TestPhoneNumbersDirectory(TestCase):

    def setUp(self):
        self.test_obj = PhoneNumbersDirectory(
            ['John:123-456-7890','Jane:987-654-3210','Joe:555-555-5555']
        )

    def test_get_directory(self):
        directory = self.test_obj.get_directory()
        self.assertEqual(directory['John'], '123-456-7890')
        self.assertEqual(directory['Jane'], '987-654-3210')
        self.assertEqual(directory['Joe'], '555-555-5555')
