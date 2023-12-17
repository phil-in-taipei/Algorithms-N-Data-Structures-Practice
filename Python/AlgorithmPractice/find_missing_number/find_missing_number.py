
class FindMissingNumber:
	def __init__(self, list_of_numbers):
		self.list_of_numbers = list_of_numbers

	def get_missing_number(self):
		if len(self.list_of_numbers) == 1:
			return 1
		n = len(self.list_of_numbers) + 1
		expected_sum_of_numbers = n * (n + 1) / 2
		actual_sum = 0
		for number in self.list_of_numbers:
			actual_sum += number
		return expected_sum_of_numbers - actual_sum

