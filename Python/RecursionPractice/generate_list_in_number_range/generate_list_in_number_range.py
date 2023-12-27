

class GenerateListInNumberRangeRecursively:

    def __init__(self, start_number, finish_number):
        self.start_number = start_number
        self.finish_number = finish_number

    def __recursively_generate_list_in_number_range(self, start_number, descending_finish_number):
        if descending_finish_number == start_number:
            return [descending_finish_number]
        number_list = self.__recursively_generate_list_in_number_range(start_number, descending_finish_number - 1)
        number_list.append(descending_finish_number)
        return number_list

    def get_list_of_numbers(self):
        finish_number = self.finish_number
        return self.__recursively_generate_list_in_number_range(
            start_number=self.start_number, descending_finish_number=finish_number
        )
