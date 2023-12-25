from list_methods_practice.list_methods_practice import ListOfNumbers


if __name__ == '__main__':
    print("------------------------------------------------------------------------------------------------------------")
    print("Initializing a new List of Numbers class with the numbers: 1, 2, 3, 4, 5, 6")
    list_of_numbers = ListOfNumbers([1, 2, 3, 4, 5, 6])
    print("------------------------------------------------------------------------------------------------------------")
    list_of_numbers_squared = list_of_numbers.square_each_item()
    print(f'This is the list with each item squared: {list_of_numbers_squared}')
    print("------------------------------------------------------------------------------------------------------------")
    sum_of_numbers_squared = list_of_numbers.get_sum_of_squares()
    print(f'This is sum of the items in the list squared: {sum_of_numbers_squared}')
    print("------------------------------------------------------------------------------------------------------------")
    even_numbers = list_of_numbers.get_even_numbers()
    print(f'This is only the even numbers in the list : {even_numbers}')
    print("------------------------------------------------------------------------------------------------------------")
    greater_than_three = list_of_numbers.get_numbers_greater_than_three()
    print(f'This is only the even numbers in the list : {greater_than_three}')
    print("------------------------------------------------------------------------------------------------------------")
