from unittest import TestCase
from find_missing_letter import FindMissingLetter


class TestFindMissingLetter(TestCase):
    def setUp(self):
        self.test_obj1 = FindMissingLetter(['c', 'd', 'e', 'g', 'h', 'i'])
        self.test_obj2 = FindMissingLetter(['M', 'N', 'P', 'Q', 'R', 'S', 'T'])
        self.test_obj3 = FindMissingLetter([])

    def test_get_missing_letter(self):
        self.assertEqual('f', self.test_obj1.get_missing_letter())
        self.assertEqual('O', self.test_obj2.get_missing_letter())
        self.assertEqual('', self.test_obj3.get_missing_letter())

