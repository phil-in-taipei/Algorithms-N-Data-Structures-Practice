package calculations

class Fibonacci(private val index : Int) {

    private fun recursivelyCalculate(descendingIndex : Int): Int {
        if (descendingIndex == 0 || descendingIndex == 1) {
            return descendingIndex
        }
        return recursivelyCalculate(descendingIndex - 1) + recursivelyCalculate(descendingIndex -2)
    }

    fun getValue(): Int {
        return recursivelyCalculate(index);
    }
}