package strings

class ReverseString(private val string: String) {

    private fun recursivelyReverse(diminishingString: String): String {
        if (diminishingString.isEmpty()) {
            return ""
        }
        val finalChar = diminishingString.takeLast(1)
        return finalChar + recursivelyReverse(diminishingString.slice(0..diminishingString.length-2))
    }

    public fun getResult(): String {
        return recursivelyReverse(string);
    }
}