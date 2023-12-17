package allCharsAreUnique

class AllCharsAreUnique(
    private val submittedString: String
) {

    fun getVerdict(): Boolean {
        val settings = mutableMapOf<Char, Boolean>()
        for (char in this.submittedString) {
            if (settings.containsKey(char)) {
                return false
            }
            settings[char] = true
        }
        return true
    }
}