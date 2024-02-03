from sorting_functions.selection_sort import selection_sort
from sorting_functions.insertion_sort import insertion_sort
from sorting.list_sorting import SortList
from sorting_functions.bubble_sort import bubble_sort1, bubble_sort2
from sorting_functions.merge_sort import merge_sort

# Press the green button in the gutter to run the script.
if __name__ == '__main__':

    print("*********************************************************************************************************")
    print("Initializing new list sorting object:")
    sorting_obj = SortList([3, 9, 2, 7, 1, 4, 6, 8, 5])
    print("---------------------------------------------------------------------------------------------------------")
    print(F"Sorting list items: {sorting_obj.list_to_sort}")
    #print("---------------------------------------------------------------------------------------------------------")
    #print(F"Sorted list (bubble sort): {sorting_obj.bubble_sort()}")
    #print("---------------------------------------------------------------------------------------------------------")

    #print(F"Sorted list (insertion sort): {sorting_obj.insertion_sort()}")

    #print("---------------------------------------------------------------------------------------------------------")

    #print(F"Sorted list (selection sort): {sorting_obj.selection_sort()}")

    #print("---------------------------------------------------------------------------------------------------------")

    #print(F"Sorted list (merge sort): {sorting_obj.merge_sort_result()}")

    print("---------------------------------------------------------------------------------------------------------")

    print(F"Sorted list (quick sort): {sorting_obj.quick_sort_result()}")

    print("*********************************************************************************************************")
    print("Sorting using selection sort function:")
    selection_sorting_result = selection_sort([3, 9, 2, 7, 1, 4, 6, 8, 5])
    print("---------------------------------------------------------------------------------------------------------")
    print(selection_sorting_result)
    print("---------------------------------------------------------------------------------------------------------")
    print("Sorting using insertion sort function:")
    insertion_sorting_result = insertion_sort([3, 9, 2, 7, 1, 4, 6, 8, 5])
    print("---------------------------------------------------------------------------------------------------------")
    print(insertion_sorting_result)
    print("*********************************************************************************************************")
    print("Sorting using bubble sort function 1:")
    bubble_sort_result1 = bubble_sort1([3, 9, 2, 7, 1, 4, 6, 8, 5])
    print("---------------------------------------------------------------------------------------------------------")
    print(bubble_sort_result1)
    print("---------------------------------------------------------------------------------------------------------")
    print("Sorting using bubble sort function 2:")
    bubble_sort_result2 = bubble_sort2([3, 9, 2, 7, 1, 4, 6, 8, 5])
    print("---------------------------------------------------------------------------------------------------------")
    print(bubble_sort_result2)
    print("---------------------------------------------------------------------------------------------------------")
    print("Sorting using merge sort (with helper function):")
    merge_sort_result = merge_sort([3, 9, 2, 7, 1, 4, 6, 8, 5])
    print("---------------------------------------------------------------------------------------------------------")
    print(merge_sort_result)
    print("---------------------------------------------------------------------------------------------------------")