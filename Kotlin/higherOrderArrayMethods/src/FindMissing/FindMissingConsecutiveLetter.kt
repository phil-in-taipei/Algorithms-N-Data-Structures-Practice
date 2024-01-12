package FindMissing

class FindMissingConsecutiveLetter(
    private val arrayOfChars: List<Char>
) {

    fun findMissingLetter(): Char? {
        var previousCode = arrayOfChars[0].code
        val missingCharCode = arrayOfChars.drop(1)
            .map { it.code }
            .find { current ->
                if (current - previousCode > 1) {
                    return@find true
                }
                previousCode = current
                return@find false
            }

        return missingCharCode?.let { Char(it - 1) }
    }
}