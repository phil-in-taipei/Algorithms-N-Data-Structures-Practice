class SymetricDifference:

    def __init__(self, list_1, list_2):
        self.list_1 = list_1
        self.list_2 = list_2

    def get_unique_values(self):
        set_1 = set(self.list_1)
        set_2 = set(self.list_2)

        unique_values_set = set()

        for item in set_1:
            if item not in set_2:
                unique_values_set.add(item)

        for item in set_2:
            if item not in set_1:
                unique_values_set.add(item)

        return list(unique_values_set)


