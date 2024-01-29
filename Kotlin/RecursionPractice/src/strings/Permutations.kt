package strings

class Permutations(private val string: String) {

    private fun recursivelyGenerate(diminishingString : String): ArrayList<String> {
        println("This is the string: $diminishingString")
        val permutations = ArrayList<String>();
        if (diminishingString.length == 1) {
            permutations.add(diminishingString)
            return permutations
        }
        for (item in diminishingString.indices) {
            val currentChar = diminishingString[item]
            val restOfString = diminishingString.substring(0, item) + diminishingString.substring(item + 1)
            val subListOfPermutations = recursivelyGenerate(restOfString)
            for (subItem in subListOfPermutations) {
                permutations.add(currentChar + subItem)
            }
        }
        return permutations
    }

    fun getArray(): ArrayList<String> {
        return recursivelyGenerate(string)
    }
}