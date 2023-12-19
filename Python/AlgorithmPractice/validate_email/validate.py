import re


class Validate:
    def __init__(self, string_to_be_validated):
        self.string_to_be_validated = string_to_be_validated

    def validate_email(self):
        email_regex = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,7}\b'
        if re.fullmatch(email_regex, self.string_to_be_validated):
            return True
        else:
            return False
