from unittest import TestCase
from .generate_list_in_number_range import GenerateListInNumberRangeRecursively


class TestGenerateListInNumberRangeRecursively(TestCase):

    def setUp(self):
        self.test_obj1 = GenerateListInNumberRangeRecursively(start_number=20, finish_number=25)
        self.test_obj2 = GenerateListInNumberRangeRecursively(start_number=-10, finish_number=3)

    def test_get_list_of_numbers(self):
        self.assertEqual([20, 21, 22, 23, 24, 25], self.test_obj1.get_list_of_numbers())
        self.assertEqual(
            [-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3],
            self.test_obj2.get_list_of_numbers()
        )

