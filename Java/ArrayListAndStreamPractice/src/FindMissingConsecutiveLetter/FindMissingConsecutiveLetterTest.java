package FindMissingConsecutiveLetter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingConsecutiveLetterTest {
    FindMissingConsecutiveLetter findMissingConsecutiveLetter = new FindMissingConsecutiveLetter(List.of('a', 'b', 'd', 'e'));

    FindMissingConsecutiveLetter findMissingConsecutiveLetter2 = new FindMissingConsecutiveLetter(List.of('a', 'b', 'c', 'e'));

    FindMissingConsecutiveLetter findMissingConsecutiveLetter3 = new FindMissingConsecutiveLetter(List.of('q', 'r', 's', 'u'));


    FindMissingConsecutiveLetter findMissingConsecutiveLetter4 = new FindMissingConsecutiveLetter(List.of('l', 'm', 'n', 'o'));


    @Test
    void findMissingLetter() {
        assertEquals(findMissingConsecutiveLetter.findMissingLetter(), 'c');
        assertEquals(findMissingConsecutiveLetter2.findMissingLetter(), 'd');
        assertEquals(findMissingConsecutiveLetter3.findMissingLetter(), 't');
        assertNull(findMissingConsecutiveLetter4.findMissingLetter());
    }
}