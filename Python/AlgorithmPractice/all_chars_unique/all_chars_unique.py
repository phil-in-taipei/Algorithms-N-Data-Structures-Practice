

class AllCharsAreUnique:
    def __init__(self, submitted_string):
        self.submitted_string = submitted_string

    def get_verdict(self):
        dict_of_chars = {}
        for char in self.submitted_string:
            if char in dict_of_chars.keys():
                return False
            else:
                dict_of_chars[char] = True
        return True
