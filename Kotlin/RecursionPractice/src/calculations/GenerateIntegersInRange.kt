package calculations

class GenerateIntegersInRange(
    private val int1: Int, private val int2: Int
) {
    private fun recursivelyGenerateIntegerList(lower: Int, higher: Int): IntArray {
        if (lower == higher) {
            return intArrayOf(lower)
        }
        val intArray = recursivelyGenerateIntegerList(lower, higher - 1)
        return intArray.plus(higher)
    }

    public fun getOutput(): IntArray {
        return recursivelyGenerateIntegerList(int1, int2)
    }
}