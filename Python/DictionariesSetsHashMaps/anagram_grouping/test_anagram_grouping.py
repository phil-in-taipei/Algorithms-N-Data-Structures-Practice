from unittest import TestCase
from .anagram_grouping import AnagramGrouping


class TestAnagramGrouping(TestCase):

    def setUp(self):
        self.test_obj_1 = AnagramGrouping(['cat', 'act', 'dog', 'god', 'tac'])
        self.test_obj_2 = AnagramGrouping(['listen', 'silent', 'enlist', 'hello', 'world'])

    def test_get_anagram_groups(self):
        self.assertEqual(
            self.test_obj_1.get_anagram_groups(),
            [['cat', 'act', 'tac'], ['dog', 'god']]
        )
        self.assertEqual(
            self.test_obj_2.get_anagram_groups(),
            [['listen', 'silent', 'enlist'], ['hello'], ['world']]
        )
