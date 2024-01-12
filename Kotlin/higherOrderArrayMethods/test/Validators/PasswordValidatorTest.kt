package Validators

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PasswordValidatorTest {

    private lateinit var validator1: PasswordValidator

    private lateinit var validator2: PasswordValidator

    private lateinit var validator3: PasswordValidator

    @BeforeEach
    fun setUp() {
        validator1 = PasswordValidator("Abc12345")
        validator2 = PasswordValidator("password123")
        validator3 = PasswordValidator("Pass")
    }

    @Test
    fun stringIsAValidPassword() {
        assertTrue(validator1.stringIsAValidPassword())
        assertFalse(validator2.stringIsAValidPassword())
        assertFalse(validator3.stringIsAValidPassword())
    }
}