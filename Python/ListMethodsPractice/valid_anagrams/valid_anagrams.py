class ValidAnagrams:

    def __init__(self, string1, string2):
        self.string1 = string1
        self.string2 = string2

    def get_verdict(self):
        return ''.join(sorted(list(self.string1))) == ''.join(sorted(list(self.string2)))

