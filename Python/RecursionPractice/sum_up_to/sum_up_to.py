
class CumulativeSumUpToNumber:
    def __init__(self, number):
        self.number = number

    def get_value(self):
        if self.number == 1:
            return 1
        self.number = self.number - 1
        return self.number + 1 + self.get_value()
