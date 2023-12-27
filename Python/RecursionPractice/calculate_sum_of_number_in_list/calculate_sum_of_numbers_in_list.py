
class CalculateSumOfListNumbersRecursively:

    def __init__(self, list_of_numbers):
        self.list_of_numbers = list_of_numbers

    def __recursively_calculate_sum_of_list_numbers(self, diminishing_list):
        if len(diminishing_list) == 0:
            return 0
        return diminishing_list[0] + self.__recursively_calculate_sum_of_list_numbers(
            diminishing_list=diminishing_list[1:]
        )

    def get_sum(self):
        full_list_of_numbers = self.list_of_numbers
        return self.__recursively_calculate_sum_of_list_numbers(diminishing_list=full_list_of_numbers)
