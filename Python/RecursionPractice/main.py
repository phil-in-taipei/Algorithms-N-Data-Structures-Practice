from count_down.count_down import CountdownRecursive
from sum_up_to.sum_up_to import CumulativeSumUpToNumber
from reverse_string.reverse_string import RecursivelyReverseString
from fibonacci.fibonacci import FibonacciViaRecursion
from factorial.factorial import FactorialViaRecursion


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
    fibonacci = FibonacciViaRecursion(7)
    print(
        f"Attempting to apply recursion to calculate fibonacci "
        f"value at index: {fibonacci.get_sequence_index()}"
    )
    print(fibonacci.get_value_at_index())
    print_divider_line()
    print_divider_line()
    factorial = FactorialViaRecursion(of_number=5)
    print(
        f"Attempting to apply recursion to calculate factorial "
        f"value of: {factorial.get_of_number()}"
    )
    print(factorial.get_output())
    print_divider_line()


