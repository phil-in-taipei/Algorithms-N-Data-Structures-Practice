from unittest import TestCase
from .permutations import Permutations


class TestPermutations(TestCase):

    def setUp(self):
        self.test_obj = Permutations()

    def test_get_list_of_permutations(self):
        self.assertEqual(
            self.test_obj.get_list_of_permutations("abc"),
    ['abc', 'acb', 'bac', 'bca', 'cab', 'cba']
        )

        self.assertEqual(
            self.test_obj.get_list_of_permutations("dog"),
            ['dog', 'dgo', 'odg', 'ogd', 'gdo', 'god']
        )
