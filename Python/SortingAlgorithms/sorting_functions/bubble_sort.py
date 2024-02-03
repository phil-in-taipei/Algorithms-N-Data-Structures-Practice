
def bubble_sort1(list_to_sort):
    for i in range(1, len(list_to_sort)):
        for j in range(1, len(list_to_sort)):
            if list_to_sort[i] < list_to_sort[j-1]:
                temporary_swap = list_to_sort[j-1]
                list_to_sort[j-1] = list_to_sort[i]
                list_to_sort[i] = temporary_swap
    return list_to_sort


def bubble_sort2(list_to_sort):
    sorting_in_progress = True
    while sorting_in_progress:
        sorting_in_progress = False
        for i in range(1, len(list_to_sort)):
            if list_to_sort[i] < list_to_sort[i - 1]:
                temporary_swap = list_to_sort[i - 1]
                list_to_sort[i - 1] = list_to_sort[i]
                list_to_sort[i] = temporary_swap
                sorting_in_progress = True
    return list_to_sort
