from fizzbuzz.fizzbuzz import Fizzbuzz
from array_intersection.array_intersection import ArrayIntersection


if __name__ == '__main__':
	print("-----------------------------------------------------------------------------------------------")
	print("First initializing Fizzbuzz class to return values up to 15")
	fizzbuzz_obj = Fizzbuzz(15)
	fb_result = fizzbuzz_obj.get_fizzbuzz()
	print("-----------------------------------------------------------------------------------------------")
	print("This is the fizz buzz result: ")
	print(fb_result)
	print("-----------------------------------------------------------------------------------------------")
	print("Initializing object to test for common values in two lists")
	print("-----------------------------------------------------------------------------------------------")
	array_intersection_object = ArrayIntersection([1, 2, 3, 4, 5], [3, 4, 5, 6, 7])

	print("-----------------------------------------------------------------------------------------------")
	print("This is the result of the array intersection:")
	ai_result = array_intersection_object.get_list_of_values_in_both_lists()
	print(ai_result)
	print("-----------------------------------------------------------------------------------------------")

	print("-----------------------------------------------------------------------------------------------")




