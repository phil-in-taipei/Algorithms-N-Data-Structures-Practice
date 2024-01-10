class FlattenNestedList:

    def get_flattened_list(self, nested_list):
        flattened_list = []
        for item in nested_list:
            if type(item) == list:
                flattened_list = [*flattened_list, *self.get_flattened_list(item)]
            else:
                flattened_list.append(item)
        return flattened_list
