package Validators

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class IPv4ValidatorTest {

    val iPv4Validator1 = IPv4Validator("1.2.3.4")
    val iPv4Validator2 = IPv4Validator("123.45.67.89")
    val iPv4Validator3 = IPv4Validator("1.2.3.4.5")
    val iPv4Validator4 = IPv4Validator("123.456.78.90")
    val iPv4Validator5 = IPv4Validator("123.045.067.089")



    @Test
    fun isValidIPv4() {
        assertTrue(iPv4Validator1.isValidIPv4())
        assertTrue(iPv4Validator2.isValidIPv4())
        assertFalse(iPv4Validator3.isValidIPv4())
        assertFalse(iPv4Validator4.isValidIPv4())
        assertFalse(iPv4Validator5.isValidIPv4())
    }
}