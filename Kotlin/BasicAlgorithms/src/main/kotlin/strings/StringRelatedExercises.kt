package strings

import java.util.*

class StringRelatedExercises(
    private val stringVar: String,
    private val charVar: Char? = null
) {

    fun capitalizeAllWordsInString(): String {
        val stringArray =this.stringVar.split(" ")
        var stringOfCapitalizedLetters = ""
        for (i in 0..<stringArray.size) {
            stringOfCapitalizedLetters += capitalizeString(stringArray[i]) + " "
        }
        return stringOfCapitalizedLetters.substring(0, stringOfCapitalizedLetters.length - 1)
    }
    private fun capitalizeString(string: String): String {
        return string.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.getDefault())
            else
                it.toString()
        }
    }

    fun getCharVar():Char? {
        return charVar;
    }

    fun getNumberOfOccurrences(): Int {
        var numberOfOccurrences = 0;
        for (c in this.stringVar) {
            if(c == this.charVar) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    fun getStringVar(): String {
        return stringVar;
    }

    fun isAPalindrome(): Boolean {
        val formattedString = removeNonAlphanumericCharactersFromString(
            this.stringVar.lowercase()
        )
        for (i in 1..formattedString.length / 2) {
            if (formattedString[i - 1] != formattedString[formattedString.length - i]) {
                return false
            }
        }
        return true
    }

    private fun removeNonAlphanumericCharactersFromString(string: String): String {
        val nonAlphaNum = "[^a-zA-Z0-9]".toRegex()
        return string.replace(nonAlphaNum, "")
    }

    fun reverseString(): String {
        val reversedString = StringBuilder()
        for (i in this.stringVar.length - 1 downTo 0) {
            val char = this.stringVar[i]
            reversedString.append(char)
        }
        return reversedString.toString()
    }

}