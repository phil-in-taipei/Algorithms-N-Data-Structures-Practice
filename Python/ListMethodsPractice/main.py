from list_methods_practice.list_methods_practice import ListOfNumbers
from validators.password_validator import PasswordValidator
from calculate_total_sales_with_tax.calculated_sales import CalculateSalesWithTax


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
    print("Initializing a new password validator with the string: Abc12345")
    print(
        "------------------------------------------------------------------------------------------------------------")
    password_validator = PasswordValidator("Abc12345")
    print(f'It is a valid password : {password_validator.string_is_a_valid_password()}')
    print("-----------------------------------------------------------------------------------------------------------")
    print("Initializing a new calculate sales with tax object:")
    products = [{"name": "Apple", "price": 0.5, "quantity": 10}, {"name": "Banana", "price": 0.3, "quantity": 20},{"name": "Orange", "price": 0.6, "quantity": 15},]
    calculate_total_obj = CalculateSalesWithTax(products, 8)
    print("-----------------------------------------------------------------------------------------------------------")
    print(F"This is the total with tax: {calculate_total_obj.get_total()}")
    print("-----------------------------------------------------------------------------------------------------------")
    
