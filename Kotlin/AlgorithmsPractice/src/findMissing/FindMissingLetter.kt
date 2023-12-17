package findMissing

class FindMissingLetter(
    private val inputArr: CharArray
) {
    var realAlphabet = "abcdefghijklmnopqrstuvwxyz"

    fun getResult(): Char {
        val startingChar = inputArr[0].toString();
        if (startingChar == startingChar.uppercase()) {
            realAlphabet = realAlphabet.uppercase();
        }
        val startIndex = realAlphabet.indexOf(startingChar);
        for (i in startIndex..startIndex + inputArr.size) {
            if (inputArr.indexOf(realAlphabet[i]) == -1) {
                return realAlphabet[i]
            }
        }
        return 0.toChar()
    }
}