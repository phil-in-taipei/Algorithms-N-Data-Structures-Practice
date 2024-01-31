
from sorting.list_sorting import SortList

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
