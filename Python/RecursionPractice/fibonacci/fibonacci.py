
class FibonacciViaRecursion:
    def __init__(self, sequence_index):
        self.sequence_index = sequence_index

    def __fibonacci_recursive_calculation(self, mutable_index):
        if mutable_index < 2:
            return mutable_index
        return (
                self.__fibonacci_recursive_calculation(mutable_index - 1)
                + self.__fibonacci_recursive_calculation(mutable_index - 2)
        )

    def get_sequence_index(self):
        return self.sequence_index

    def get_value_at_index(self):
        index = self.sequence_index
        return self.__fibonacci_recursive_calculation(mutable_index=index)
