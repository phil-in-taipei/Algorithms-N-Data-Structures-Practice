

def insertion_sort(list_to_sort):
    for i in range(1, len(list_to_sort)):
        sorted_insertion_index = i - 1
        current_item = list_to_sort[i]
        while sorted_insertion_index >= 0 and current_item < list_to_sort[sorted_insertion_index]:
            list_to_sort[sorted_insertion_index + 1] = list_to_sort[sorted_insertion_index]
            sorted_insertion_index -= 1
        list_to_sort[sorted_insertion_index + 1] = current_item
    return list_to_sort
