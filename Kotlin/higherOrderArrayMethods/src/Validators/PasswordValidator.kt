package Validators

class PasswordValidator(
    private val string : String
) {

    private fun isGreaterThanOrEqualToEightCharacters(): Boolean {
        return string.length >= 8;
    }

    private fun hasAtLeastOneLowerCaseCharacter(): Boolean {
        return string.toCharArray().any{ it.isLowerCase() }
    }

    private fun hasAtLeastOneNumericDigitCharacter(): Boolean {
        return string.toCharArray().any{ it.isDigit() }
    }

    private fun hasAtLeastOneUpperCaseCharacter(): Boolean {
        return string.toCharArray().any{ it.isUpperCase() }
    }

    public fun stringIsAValidPassword(): Boolean {
        return this.isGreaterThanOrEqualToEightCharacters()
                && this.hasAtLeastOneLowerCaseCharacter()
                && this.hasAtLeastOneNumericDigitCharacter()
                && this.hasAtLeastOneUpperCaseCharacter()
    }
}