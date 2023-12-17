package findMissing

// note: this only works for arrays with '1' as the lowest value
class FindMissingNumber(
    private val arrayOfNumbers: IntArray
) {
    fun getResult(): Int {
        if(arrayOfNumbers.isEmpty()) {
            return 1
        }
        val n: Int = arrayOfNumbers.size + 1
        val expectedSum: Int = (n * (n + 1) / 2)
        var actualSum: Int = 0;
        for (number in arrayOfNumbers) {
            actualSum += number;
        }
        return expectedSum - actualSum
    }
}