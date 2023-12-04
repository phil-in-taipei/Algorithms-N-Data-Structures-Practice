class FindOccurrences:
    def __init__(self, string, character):
        self.string = string
        self.character = character

    def get_number(self):
        number_of_occurrences = 0
        for s in self.string:
            if s == self.character:
                number_of_occurrences += 1
        return number_of_occurrences
