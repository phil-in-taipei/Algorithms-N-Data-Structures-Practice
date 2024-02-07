package reverseInteger

class ReverseInteger(private var int: Int) {

    fun getInt(): Int {
        return int
    }

    fun reverseIteratively(): Int {
        var reversedInt = 0
        var diminishingInt = int
        while (diminishingInt != 0) {
            reversedInt = (reversedInt * 10) + diminishingInt % 10
            diminishingInt /= 10
        }
        return reversedInt
    }

    private fun reverseRecursiveHelper(
        reversedInt: Int, diminishingInt : Int
    ): Int {
        if (diminishingInt == 0) {
            return reversedInt
        }
        return reverseRecursiveHelper(
            reversedInt = (reversedInt * 10) + (diminishingInt % 10),
            diminishingInt = diminishingInt / 10
        )
    }

    fun reverseRecursively(): Int {
        return reverseRecursiveHelper(
            reversedInt=0, diminishingInt=int
        )
    }
}