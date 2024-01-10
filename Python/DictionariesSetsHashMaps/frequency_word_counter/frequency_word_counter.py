import re


class FrequencyWordCounter:
    def __init__(self, string_of_words):
        self.string_of_words = string_of_words

    def get_count(self):
        word_count_dictionary = {}
        list_of_words = self.string_of_words.lower().split(" ")
        for word in list_of_words:
            formatted_word = re.sub(r"[^A-Za-z]+", '', word)
            if formatted_word in word_count_dictionary:
                word_count_dictionary[formatted_word] += 1
            else:
                word_count_dictionary[formatted_word] = 1
        return word_count_dictionary
