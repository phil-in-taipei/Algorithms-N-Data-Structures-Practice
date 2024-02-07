package reverseInteger

class ReverseInteger(private var int: Int) {

    fun reverseIteratively(): Int {
        var reversedInt = 0
        while (int != 0) {
            reversedInt = (reversedInt * 10) + int % 10
            int /= 10
        }
        return reversedInt
    }
}