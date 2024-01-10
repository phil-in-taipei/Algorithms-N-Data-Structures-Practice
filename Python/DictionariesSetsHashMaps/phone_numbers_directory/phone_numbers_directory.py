

class PhoneNumbersDirectory:

    def __init__(self, list_of_phone_numbers):
        self.list_of_phone_numbers = list_of_phone_numbers

    def get_directory(self):
        directory = {}
        for record in self.list_of_phone_numbers:
            record_list = record.split(":")
            directory[record_list[0]] = record_list[1]
        return directory
