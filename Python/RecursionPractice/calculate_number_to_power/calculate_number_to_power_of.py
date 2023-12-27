
class PowerOfRecursive:
    def __init__(self, number, to_power_of):
        self.number = number
        self.to_power_of = to_power_of

    def get_number(self):
        return self.number

    def get_to_power_of(self):
        return self.to_power_of

    def __recursive_calculation_of_number_to_power_of(self, descending_power_of):
        if descending_power_of == 0:
            return 1
        return self.__recursive_calculation_of_number_to_power_of(descending_power_of - 1) * self.number

    def get_result(self):
        power_of = self.to_power_of
        return self.__recursive_calculation_of_number_to_power_of(descending_power_of=power_of)
