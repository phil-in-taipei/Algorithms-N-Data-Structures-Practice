from frequency_word_counter.frequency_word_counter import FrequencyWordCounter


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

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
