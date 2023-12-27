

class CountdownRecursive:
    def __init__(self, count_down_from):
        self.count_down_from = count_down_from

    def output(self):
        if self.count_down_from == 0:
            print("Finished!")
            return
        print(f"The number is: {self.count_down_from}")
        self.count_down_from = self.count_down_from - 1
        self.output()
