package calculations

class Factorial(private val int: Int) {

    private fun recursivelyCalculate(descendingInt : Int): Int {
        if (descendingInt == 0 || descendingInt == 1) {
            return 1
        }
        return recursivelyCalculate(descendingInt - 1) * descendingInt
    }

    fun getValue(): Int {
        return recursivelyCalculate(int)
    }
}