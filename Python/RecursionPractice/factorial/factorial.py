
class FactorialViaRecursion:
    def __init__(self, of_number):
        self.of_number = of_number

    def __get_factorial(self, descending_number):
        if descending_number == 0 or descending_number == 1:
            return 1
        return self.__get_factorial(descending_number - 1) * descending_number

    def get_of_number(self):
        return self.of_number

    def get_output(self):
        number = self.of_number
        return self.__get_factorial(descending_number=number)
