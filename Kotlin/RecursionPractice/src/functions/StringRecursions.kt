package functions

fun reverseString(stringToReverse : String): String {
    if (stringToReverse.isEmpty()) {
        return ""
    }
    val lastChar = stringToReverse[stringToReverse.length - 1]
    val restOfString = stringToReverse.dropLast(1);
    return lastChar + reverseString(restOfString);
}

fun reverseStringAlt(stringToReverse: String): String {
    if (stringToReverse.isEmpty()) {
        return ""
    }
    val firstChar = stringToReverse[0]
    val restOfString = stringToReverse.substring(1)
    return reverseString(restOfString) + firstChar
}

fun getListOfPermutations(string: String): ArrayList<String> {
    val permutations = ArrayList<String>();
    if (string.length == 1) {
        permutations.add(string);
        return permutations
    }
    for (i in 0..<string.length) {
        val currentChar = string[i]
        val restOfString = string.substring(0, i) + string.substring(i + 1)
        val subItemList = getListOfPermutations(restOfString)
        for (item in subItemList) {
            permutations.add(item + currentChar)
        }
    }
    return permutations

}