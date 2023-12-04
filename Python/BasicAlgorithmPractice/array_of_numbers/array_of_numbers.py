class ListOfNumbers:
    def __init__(self, numbers):
        self.numbers = numbers

    def find_highest_number(self):
        max_value = self.numbers[0]
        for i in range(1, len(self.numbers)):
            if self.numbers[i] > max_value:
                max_value = self.numbers[i]
        return max_value

