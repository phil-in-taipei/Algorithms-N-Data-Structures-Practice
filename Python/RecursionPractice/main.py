from count_down.count_down import CountdownRecursive
from sum_up_to.sum_up_to import CumulativeSumUpToNumber
from reverse_string.reverse_string import RecursivelyReverseString

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


