
class RecursivelyReverseString:
    def __init__(self, input_string):
        self.input_string = input_string

    def get_output(self):
        if self.input_string == "":
            return self.input_string
        substring = self.input_string[0]
        self.input_string = self.input_string[1:]
        return self.get_output() + substring
