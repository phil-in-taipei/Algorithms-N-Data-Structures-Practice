package highestScoringWord

import calculateSalesAmount.SalesTransaction
import java.math.BigDecimal

class HighestScoringWord(
    private val stringOfWords: String
) {
    private fun getCharScore(char: Char): Int {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        return alphabet.indexOf(char) + 1;
    }

    private fun getWordScore(word: String): Int {
        val wordAsArray = word.split("")
        // note: the first element is a comma (quirk of splitting a word in kotlin)
        return wordAsArray.subList(1, wordAsArray.size - 1).sumOf { getCharScore(it.single()) }
        // note: the above is a simplification of:
        //return wordAsArray.subList(1,  wordAsArray.size - 1)
           // .map { getCharScore(it.single()) } // single() converts String to Char
            //.sum() // or can use line below
            //.reduce { acc, value -> acc + value }
    }

    fun getHighestScoringWord(): String {
        val arrayOfWords = stringOfWords.lowercase().split(" ")
        val arrayOfWordScores = ArrayList<Int>()
        arrayOfWords.forEach {
            arrayOfWordScores.add(getWordScore(it))
        }
        val maxWordScoreValue = arrayOfWordScores.max()
        val indexOfMaxValue = arrayOfWordScores.indexOf(maxWordScoreValue)
        return arrayOfWords[indexOfMaxValue]
    }
}