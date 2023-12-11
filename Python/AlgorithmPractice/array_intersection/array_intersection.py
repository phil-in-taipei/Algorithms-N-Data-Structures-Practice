
#class UnequalListLengthError(Exception):
#    pass


class ArrayIntersection:

    def __init__(self, list_1, list_2):
        if len(list_1) != len(list_2):
            raise Exception(
                f"List lengths must be equal! List one has {len(list_1)} " +
                f"items, but list two has {len(list_2)} items"
            )
        self.list_1 = list_1
        self.list_2 = list_2

    def get_list_of_values_in_both_lists(self):
        in_both_lists = []
        for item in self.list_1:
            if item in self.list_2:
                in_both_lists.append(item)
        return in_both_lists
