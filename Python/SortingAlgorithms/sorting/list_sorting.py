

class SortList:

    def __init__(self, list):
        self.list = list

    def bubble_sort(self):
        swapping_in_progress = True
        while swapping_in_progress:
            swapping_in_progress = False
            for i in range(1, len(self.list)):
                if self.list[i] < self.list[i-1]:
                    temp_value = self.list[i-1]
                    self.list[i-1] = self.list[i]
                    self.list[i] = temp_value
                    swapping_in_progress = True
        return self.list

    def insertion_sort(self):
        for i in range(1, len(self.list)):
            current_item = self.list[i]
            sorted_insertion_index = i - 1
            while sorted_insertion_index >= 0 and self.list[sorted_insertion_index] > current_item:
                self.list[sorted_insertion_index + 1] = self.list[sorted_insertion_index]
                sorted_insertion_index -= 1
            self.list[sorted_insertion_index + 1] = current_item
        return self.list
