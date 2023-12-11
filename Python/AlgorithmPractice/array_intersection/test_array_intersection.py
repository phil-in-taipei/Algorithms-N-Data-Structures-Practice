from unittest import TestCase
from .array_intersection import ArrayIntersection


class TestArrayIntersection(TestCase):

    def setUp(self):
        self.test_input_list_1 = [1, 2, 3, 4, 5]
        self.test_input_list_2 = [3, 4, 5, 6, 7]
        self.test_result_list = [3, 4, 5]

    def test_get_list_of_values_in_both_lists(self):
        test_object = ArrayIntersection(self.test_input_list_1, self.test_input_list_2)
        print("Testing that items are in both input lists")
        result = test_object.get_list_of_values_in_both_lists()
        self.assertEqual(result, self.test_result_list)

    def init_failure_due_to_unequal_lists_input(self):
        print("Testing that exception is raised if both input lists have unequal lengths")
        list_with_too_many_values = self.test_input_list_2
        list_with_too_many_values.append(8)
        with self.assertRaises(Exception):
            ArrayIntersection(
                self.test_input_list_1,
                list_with_too_many_values
            )
