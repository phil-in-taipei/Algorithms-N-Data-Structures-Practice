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