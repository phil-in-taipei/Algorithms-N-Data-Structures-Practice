package anagrams

class AnagramValidation(
    private val string1: String,
    private val string2: String
) {

    private fun getFrequencyCount(string: String): MutableMap<Char, Int> {
        val stringAsArray = string.split("")
        val frequencyCount = mutableMapOf<Char, Int>()
        for (char in stringAsArray.subList(1, stringAsArray.size - 1).map{ i -> i.single()}) {
            if(frequencyCount[char] != null) {
                frequencyCount[char] = frequencyCount[char]!! + 1
            } else {
                frequencyCount[char] = 1
            }
        }
        return frequencyCount
    }
    private fun sortStringAlphabetically(string: String): String {
        val stringAsArray = string.split("")
        return stringAsArray.subList(1, stringAsArray.size - 1).sorted().toString()
    }
    fun validateByMeansOfStringComparison(): Boolean {
        return sortStringAlphabetically(string1) == sortStringAlphabetically(string2)
    }

    fun validateByMeansOfMapComparison(): Boolean {
        return getFrequencyCount(string1) == getFrequencyCount(string2)
    }


}