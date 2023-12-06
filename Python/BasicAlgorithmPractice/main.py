from calculator import calculator_class
from string_related_practice import find_occurences, assorted_string_methods
from array_of_numbers import array_of_numbers


if __name__ == '__main__':
    print("-------------------------------------------------------------------------")
    print("Calculator class with 10 and 2 input as argument values")
    calculator = calculator_class.Calculator(10, 2)
    print("-------------------------------------------------------------------------")
    print("The addition output is: " + str(calculator.add()))
    print("-------------------------------------------------------------------------")
    print("The subtraction output is: " + str(calculator.subtract()))
    print("-------------------------------------------------------------------------")
    print("The multiplication output is: " + str(calculator.multiply()))
    print("-------------------------------------------------------------------------")
    print("The division output is: " + str(calculator.divide()))
    print("-------------------------------------------------------------------------")
    print("Finished!")
    print("-------------------------------------------------------------------------")

    print("-------------------------------------------------------------------------")
    print("Find occurrences class with 'hellLo world' and 'l'")
    occurrences = find_occurences.FindOccurrences('hellLo world', 'l')
    print("-------------------------------------------------------------------------")
    print("There are {} instances of 'l' in 'hellLo world".format(occurrences.get_number()))
    print("-------------------------------------------------------------------------")

    print("-------------------------------------------------------------------------")
    print("Find occurrences this highest number in the list of: 2, 1, 9, 9, 16, 10, 1")
    numbers = array_of_numbers.ListOfNumbers([2, 1, 9, 9, 16, 10, 1])
    print("-------------------------------------------------------------------------")
    print("{} is the highest number of {}".format(numbers.find_highest_number(), [2, 1, 9, 16, 10]))
    print("-------------------------------------------------------------------------")
    print("Remove duplicates in the list of: 2, 1, 9, 9, 16, 10, 1")
    print("-------------------------------------------------------------------------")
    print("The new list is: {}".format(numbers.remove_duplicates()))
    print("-------------------------------------------------------------------------")

    print("-------------------------------------------------------------------------")
    print("Now creating an Assorted string object to try some methods:")
    string_object = assorted_string_methods.AssortedStringPractice("A man, a plan, a canal, Panama")
    print("-------------------------------------------------------------------------")
    print("This is the string object changed to title case: {}".format(string_object.title_case()))
    print("-------------------------------------------------------------------------")
    print("This tests that the string object is a palindrome: {}".format(string_object.is_a_palindrome()))
    print("-------------------------------------------------------------------------")
    print("This is the string revered: {}".format(string_object.reverse_string()))
    print("-------------------------------------------------------------------------")

