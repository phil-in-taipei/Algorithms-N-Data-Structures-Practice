
def quick_sort(list_to_sort):
    if len(list_to_sort) <= 1:
        return list_to_sort
    pivot = list_to_sort[len(list_to_sort) - 1]
    left_list = []
    right_list = []
    for i in range(len(list_to_sort) - 1):
        if list_to_sort[i] < pivot:
            left_list.append(list_to_sort[i])
        else:
            right_list.append(list_to_sort[i])
    left_sorted = quick_sort(left_list)
    right_sorted = quick_sort(right_list)
    return left_sorted + [pivot] + right_sorted
