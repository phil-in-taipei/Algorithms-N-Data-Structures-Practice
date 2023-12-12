package displayLikes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DisplayLikesTest {

    val displayLikes1: DisplayLikes = DisplayLikes(arrayOf("Jack"))

    val displayLikes2: DisplayLikes = DisplayLikes(arrayOf("Jack", "Alice"))

    val displayLikes3: DisplayLikes = DisplayLikes(arrayOf("Jack", "Alice", "Laura"))

    val displayLikes4: DisplayLikes = DisplayLikes(arrayOf("Jack", "Alice", "Laura", "Wanda"))

    val displayLikes5: DisplayLikes = DisplayLikes(arrayOf())


    @Test
    fun getLikesMessage() {
        assertEquals("Jack likes this", displayLikes1.getLikesMessage())
        assertEquals("Jack and Alice like this", displayLikes2.getLikesMessage())
        assertEquals("Jack, Alice and Laura like this", displayLikes3.getLikesMessage())
        assertEquals("Jack, Alice and 2 others like this", displayLikes4.getLikesMessage())
        assertEquals("Nobody likes this", displayLikes5.getLikesMessage())
    }
}