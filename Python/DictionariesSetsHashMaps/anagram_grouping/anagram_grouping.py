

class AnagramGrouping:

    def __init__(self, list_of_words):
        self.list_of_words = list_of_words

    def get_anagram_groups(self):
        dictionary_of_sorted_words = {}
        for word in self.list_of_words:
            sorted_word = ''.join(sorted(list(word)))
            if sorted_word in dictionary_of_sorted_words:
                dictionary_of_sorted_words[sorted_word].append(word)
            else:
                dictionary_of_sorted_words[sorted_word] = [word]
        return list(dictionary_of_sorted_words.values())
