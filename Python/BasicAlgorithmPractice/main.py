from calculator import calculator_class
from find_occurences import find_occurences
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
    print("Find occurrences class with 'hellLo world' and 'l'")
    numbers = array_of_numbers.ListOfNumbers([2, 1, 9, 16, 10])
    print("-------------------------------------------------------------------------")
    print("{} is the highest number of {}".format(numbers.find_highest_number(), [2, 1, 9, 16, 10]))
    print("-------------------------------------------------------------------------")
