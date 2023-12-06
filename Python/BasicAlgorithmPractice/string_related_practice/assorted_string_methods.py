import re


class AssortedStringPractice:
    def __init__(self, string):
        self.string = string

    def is_a_palindrome(self):
        formatted_string = (re.sub('[^A-Za-z0-9]+', ' ', self.string)
                            .lstrip().lower().replace(" ", ""))
        for i in range(1, int(len(formatted_string) / 2)):
            if formatted_string[i - 1] != formatted_string[len(formatted_string) - i]:
                return False
        return True

    def reverse_string(self):
        reversed_string = ""
        if len(self.string) > 0:
            for i in range(len(self.string) - 1, 0, -1):
                reversed_string += self.string[i]
            reversed_string = reversed_string[:-1]
        return reversed_string

    def title_case(self):
        list_of_words_in_string = self.string.split(" ")
        formatted_string = ''
        for word in list_of_words_in_string:
            if len(formatted_string) > 0:
                formatted_string += " "
            formatted_string += word[0].upper() + word[1:].lower()
        return formatted_string




