

def selection_sort(list_to_sort):
    for outer_index in range(len(list_to_sort)):
        lowest_value_index = outer_index
        for inner_index in range(lowest_value_index, len(list_to_sort)):
            if list_to_sort[lowest_value_index] > list_to_sort[inner_index]:
                lowest_value_index = inner_index

        if outer_index != lowest_value_index:
            temp_value = list_to_sort[lowest_value_index]
            list_to_sort[lowest_value_index] = list_to_sort[outer_index]
            list_to_sort[outer_index] = temp_value

    return list_to_sort
