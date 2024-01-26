package calculations

class SumOfArrayOfIntegers(private var intArray: IntArray) {
    private fun recursivelyCalculateSum(arr: IntArray): Int {
        if (arr.size == 1) {
            return arr[0]
        }
        val removedItem = arr[0]
        return recursivelyCalculateSum(arr.sliceArray(1..<arr.size)) + removedItem
    }

    public fun getSum(): Int {
        return recursivelyCalculateSum(intArray)
    }
}