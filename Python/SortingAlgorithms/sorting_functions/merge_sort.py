
def merge(left_list, right_list):
    left_index = 0
    right_index = 0
    sorted_items = []
    while left_index < len(left_list) and right_index < len(right_list):
        if left_list[left_index] < right_list[right_index]:
            sorted_items.append(left_list[left_index])
            left_index += 1
        else:
            sorted_items.append(right_list[right_index])
            right_index += 1
    return sorted_items + left_list[left_index:] + right_list[right_index:]


def merge_sort(list_to_be_sorted):
    if len(list_to_be_sorted) <= 1:
        return list_to_be_sorted
    mid_point = len(list_to_be_sorted) // 2
    left_list = merge_sort(list_to_be_sorted[0:mid_point])
    right_list = merge_sort(list_to_be_sorted[mid_point:])
    return merge(left_list, right_list)
