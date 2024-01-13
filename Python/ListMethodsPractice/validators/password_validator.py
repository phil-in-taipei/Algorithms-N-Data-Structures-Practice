
class PasswordValidator:
    def __init__(self, string):
        self.string = string

    def _is_greater_than_or_equal_to_eight_characters(self):
        return len(self.string) >= 8

    def _has_at_least_one_lowercase_character(self):
        #return len([c for c in self.string if c.islower()]) > 0
        return any(ele.islower() for ele in list(self.string))

    def _has_at_least_one_uppercase_character(self):
        #return len([c for c in self.string if c.isupper()]) > 0
        return any(ele.isupper() for ele in list(self.string))

    def _has_at_least_one_numeric_digit_character(self):
        #return len([c for c in self.string if c.isdigit()]) > 0
        return any(ele.isdigit() for ele in list(self.string))

    def string_is_a_valid_password(self):
        return (
                self._is_greater_than_or_equal_to_eight_characters()
                and self._has_at_least_one_lowercase_character()
                and self._has_at_least_one_uppercase_character()
                and self._has_at_least_one_numeric_digit_character()
                )

