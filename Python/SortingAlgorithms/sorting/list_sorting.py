

class SortList:

    def __init__(self, list_to_sort):
        self.list_to_sort = list_to_sort

    def bubble_sort(self):
        swapping_in_progress = True
        while swapping_in_progress:
            swapping_in_progress = False
            for i in range(1, len(self.list_to_sort)):
                if self.list_to_sort[i] < self.list_to_sort[i-1]:
                    temp_value = self.list_to_sort[i-1]
                    self.list_to_sort[i-1] = self.list_to_sort[i]
                    self.list_to_sort[i] = temp_value
                    swapping_in_progress = True
        return self.list_to_sort

    def insertion_sort(self):
        for i in range(1, len(self.list_to_sort)):
            current_item = self.list_to_sort[i]
            sorted_insertion_index = i - 1
            while (sorted_insertion_index >= 0
                   and self.list_to_sort[sorted_insertion_index] > current_item):
                self.list_to_sort[sorted_insertion_index + 1] = self.list_to_sort[sorted_insertion_index]
                sorted_insertion_index -= 1
            self.list_to_sort[sorted_insertion_index + 1] = current_item
        return self.list_to_sort

    def _merge_lists(self, left_list, right_list):
        #print(F"Merge lists method --- Left: {left_list} -- Right: {right_list}")
        merged_list = []
        left_index = 0
        right_index = 0
        while left_index < len(left_list) and right_index < len(right_list):
            if left_list[left_index] < right_list[right_index]:
                merged_list.append(left_list[left_index])
                left_index += 1
            else:
                merged_list.append(right_list[right_index])
                right_index += 1
        remaining_left_list = left_list[left_index:]
        remaining_right_list = right_list[right_index:]
        return merged_list + remaining_left_list + remaining_right_list

    def _merge_sort_recursively(self, sorting_list):
        #print(F"This is the sorting list in the recursive method: {sorting_list}")
        if len(sorting_list) <= 1:
            return sorting_list
        midpoint_in_list = len(sorting_list) // 2
        left_list = self._merge_sort_recursively(sorting_list[0:midpoint_in_list])
        right_list = self._merge_sort_recursively(sorting_list[midpoint_in_list:])
        return self._merge_lists(left_list, right_list)

    def merge_sort_result(self):
        return self._merge_sort_recursively(self.list_to_sort)

    def _quick_sort_recursive(self, sorting_list):
        #print(F"Quick sort recursion with this list: {sorting_list}")
        if len(sorting_list) <= 1:
            return sorting_list
        pivot = sorting_list[len(sorting_list) - 1]
        left_list = []
        right_list = []
        # the range excludes the last element because it is the pivot
        for i in range(len(sorting_list) - 1):
            if sorting_list[i] < pivot:
                left_list.append(sorting_list[i])
            else:
                right_list.append(sorting_list[i])
        left_recursion_value = self._quick_sort_recursive(left_list)
        right_recursion_value = self._quick_sort_recursive(right_list)
        return left_recursion_value + [pivot] + right_recursion_value

    def quick_sort_result(self):
        return self._quick_sort_recursive(self.list_to_sort)

    def selection_sort(self):
        for outer_index in range(0, len(self.list_to_sort)):
            lowest_value_index = outer_index
            for inner_index in range(outer_index + 1, len(self.list_to_sort)):
                if self.list_to_sort[lowest_value_index] > self.list_to_sort[inner_index]:
                    lowest_value_index = inner_index

            if lowest_value_index != outer_index:
                temp_value = self.list_to_sort[outer_index]
                self.list_to_sort[outer_index] = self.list_to_sort[lowest_value_index]
                self.list_to_sort[lowest_value_index] = temp_value
        return self.list_to_sort

