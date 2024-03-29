from count_down.count_down import CountdownRecursive
from sum_up_to.sum_up_to import CumulativeSumUpToNumber
from reverse_string.reverse_string import RecursivelyReverseString
from fibonacci.fibonacci import FibonacciViaRecursion
from factorial.factorial import FactorialViaRecursion
from calculate_number_to_power.calculate_number_to_power_of import PowerOfRecursive
from calculate_sum_of_number_in_list.calculate_sum_of_numbers_in_list import CalculateSumOfListNumbersRecursively
from generate_list_in_number_range.generate_list_in_number_range import GenerateListInNumberRangeRecursively
from flatten_nested_list.flatten_nested_list import FlattenNestedList
from permutations.permutations import Permutations


def print_intro(name_of_class):
    print(f'Initialization of {name_of_class} object')


def print_divider_line():
    print("------------------------------------------------------------------------------------------------------------")


if __name__ == '__main__':
    print_divider_line()
    print_intro('These are some examples of recursive programming')
    print_divider_line()
    print_divider_line()
    print_intro("CountDownRecursive")
    print("Attempting recursion to count down from a value: 6")
    count_down = CountdownRecursive(6)
    count_down.output()
    print_divider_line()
    print_divider_line()
    print_intro("CumulativeSumUpToNumber")
    print("Attempting recursion to calculate cumulative sum up to: 10")
    sum_up_to = CumulativeSumUpToNumber(10)
    print(sum_up_to.get_value())
    print_divider_line()
    print_divider_line()
    print_intro("RecursivelyReverseString")
    reverse_string = RecursivelyReverseString("python")
    print("Attempting recursion to reverse the string: python")
    print(reverse_string.get_output())
    print_divider_line()
    print_divider_line()
    print_intro("FibonacciViaRecursion")
    fibonacci = FibonacciViaRecursion(7)
    print(
        f"Attempting to apply recursion to calculate fibonacci "
        f"value at index: {fibonacci.get_sequence_index()}"
    )
    print(fibonacci.get_value_at_index())
    print_divider_line()
    print_divider_line()
    print_intro("FactorialViaRecursion")
    print_divider_line()
    factorial = FactorialViaRecursion(of_number=5)
    print(
        f"Attempting to apply recursion to calculate factorial "
        f"value of: {factorial.get_of_number()}"
    )
    print(factorial.get_output())
    print_divider_line()
    print_divider_line()
    print_intro("PowerOfRecursive")
    print_divider_line()
    power = PowerOfRecursive(number=2, to_power_of=3)
    print(
        f"Attempting to apply recursion to calculate {power.get_number()} "
        f"to the power of: {power.get_to_power_of()}"
    )
    print(f"This result is: {power.get_result()}")
    print_divider_line()
    print_divider_line()
    print_intro("CalculateSumOfListNumbersRecursively")
    print_divider_line()
    list_of_numbers = CalculateSumOfListNumbersRecursively(list_of_numbers=[1, 2, 3, 4, 5])
    print(
        f"Attempting to apply recursion to calculate the sum of this list: "
        f"[1, 2, 3, 4, 5]"
    )
    print(f"The result is: {list_of_numbers.get_sum()}")
    print_divider_line()
    print_divider_line()
    print_intro("GenerateListInNumberRangeRecursively")
    print_divider_line()
    numbers_in_range = GenerateListInNumberRangeRecursively(start_number=5, finish_number=15)
    print(
        f"Attempting to apply recursion to generate a list of numbers between: "
        f"5 and 15"
    )
    print(f"The result is: {numbers_in_range.get_list_of_numbers()}")
    print_divider_line()
    print_divider_line()
    print_intro("FlattenNestedListRecursively")
    list_to_flatten = FlattenNestedList()
    flattened_list = list_to_flatten.get_flattened_list([1, [2, 3, 4], [5, 6], 7, [8, 9]])
    print(flattened_list)
    print_divider_line()
    print_intro("Permutations of a string -- abc")
    print_divider_line()
    permutations_generator = Permutations()
    list_of_permutations = permutations_generator.get_list_of_permutations("abc")
    print(str(list_of_permutations))
    print_divider_line()

