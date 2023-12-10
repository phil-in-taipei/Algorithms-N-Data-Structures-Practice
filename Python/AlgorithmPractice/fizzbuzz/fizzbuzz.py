class Fizzbuzz:
	def __init__(self, max_num):
		self.max_num = max_num

	def get_fizzbuzz(self):
		fizzbuzz_list = []
		i = 0
		while i < self.max_num:
			i = i + 1
			divisible_by_3_or_5 = False
			return_string = ""
			if i % 3 == 0:
				return_string += "fizz"
				divisible_by_3_or_5 = True
			if i % 5 == 0:
				return_string += "buzz"
				divisible_by_3_or_5 = True
			if divisible_by_3_or_5 == True:
				fizzbuzz_list.append(return_string)
			else:
				fizzbuzz_list.append(i)
		return fizzbuzz_list
