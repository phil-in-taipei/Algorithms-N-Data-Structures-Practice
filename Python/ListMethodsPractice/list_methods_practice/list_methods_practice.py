from functools import reduce


class ListOfNumbers:
    def __init__(self, list_of_numbers):
        self.list_of_numbers = list_of_numbers

    def get_even_numbers(self):
        return list(filter(lambda x:x%2==0, self.list_of_numbers))

    def get_numbers_greater_than_three(self):
        return list(filter(lambda x: x > 3, self.list_of_numbers))

    def square_each_item(self):
        return list(map(lambda x: x*x, self.list_of_numbers))

    def get_sum_of_squares(self):
        values_squared = self.square_each_item()
        return reduce(lambda a, b: a + b, values_squared)


