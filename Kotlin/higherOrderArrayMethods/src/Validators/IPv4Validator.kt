package Validators

class IPv4Validator(
    val string: String
) {

    private fun getSubAddressArray(): List<String> {
        return string.split(".")
    }

    private fun noSubArrayItemBeginsWithZero(): Boolean {
        return this.getSubAddressArray().all { !it.startsWith('0') }
    }

    private fun itHasFourSubAddresses(): Boolean {
        return this.getSubAddressArray().size == 4
    }

    private fun allSubArraysBetweenZeroAndTwoFiftyFive(): Boolean {
        return this.getSubAddressArray().all { it.toInt() in 1..255 }
    }

    public fun isValidIPv4(): Boolean {
        return this.noSubArrayItemBeginsWithZero() && this.itHasFourSubAddresses()
                && this.allSubArraysBetweenZeroAndTwoFiftyFive()
    }

}