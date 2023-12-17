
class FindMissingLetter:

    def __init__(self, list_of_letters):
        self.list_of_letters = list_of_letters

    def get_missing_letter(self):
        real_alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        if len(self.list_of_letters) > 0:
            starting_char = self.list_of_letters[0]
            start_index = real_alphabet.index(starting_char)
            for i in range(start_index, start_index + len(self.list_of_letters)):
                if real_alphabet[i] not in self.list_of_letters:
                    return real_alphabet[i]
        return ""
