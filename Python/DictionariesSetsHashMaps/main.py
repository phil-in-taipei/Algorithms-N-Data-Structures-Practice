from frequency_word_counter.frequency_word_counter import FrequencyWordCounter
from phone_numbers_directory.phone_numbers_directory import PhoneNumbersDirectory
from anagram_grouping.anagram_grouping import AnagramGrouping
from symetric_difference.symetric_difference import SymetricDifference

# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    print('----------------------------------------------------------------------------------------------')
    print('Testing frequencies of words in the following string:')
    print("The quick brown fox jumps over the lazy dog. The dog barks, and the fox runs away.")

    counter = FrequencyWordCounter(
        "The quick brown fox jumps over the lazy dog. The dog barks, and the fox runs away."
    )
    results = counter.get_count()
    print(results)
    print('----------------------------------------------------------------------------------------------')
    print('Testing phone numbers creation class')
    directory = PhoneNumbersDirectory(['John:123-456-7890', 'Jane:987-654-3210', 'Joe:555-555-5555'])
    print('----------------------------------------------------------------------------------------------')
    print("These are the results: " + str(directory.get_directory()))
    print('----------------------------------------------------------------------------------------------')
    print('Testing anagram grouping')
    anagrams = AnagramGrouping(['cat', 'act', 'dog', 'god', 'tac'])
    print('----------------------------------------------------------------------------------------------')
    anagrams.get_anagram_groups()
    print("These are the results: " + str(anagrams.get_anagram_groups()))
    print('----------------------------------------------------------------------------------------------')

    print('----------------------------------------------------------------------------------------------')
    print('Now implementing the unique values object')
    print('----------------------------------------------------------------------------------------------')
    symetric_difference = SymetricDifference([1, 2, 3], [3, 4, 5])
    unique_values = symetric_difference.get_unique_values()

    print('These are the unique values')
    print(str(unique_values))
