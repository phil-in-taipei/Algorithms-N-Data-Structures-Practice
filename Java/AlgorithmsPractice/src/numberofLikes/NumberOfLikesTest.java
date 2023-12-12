package numberofLikes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLikesTest {
    NumberOfLikes numberOfLikes1;

    NumberOfLikes numberOfLikes2;

    NumberOfLikes numberOfLikes3;

    NumberOfLikes numberOfLikes4;

    NumberOfLikes numberOfLikes5;


    @BeforeEach
    void setUp() {
        this.numberOfLikes1 = new NumberOfLikes(new String[]{"Ding-Dong", "Bling-Blong", "Schling-Schlong", "Garry"});
        this.numberOfLikes2 = new NumberOfLikes(new String[]{"Schling-Schlong", "Garry"});
        this.numberOfLikes3 = new NumberOfLikes(new String[]{"Bling-Blong", "Schling-Schlong", "Garry"});
        this.numberOfLikes4 = new NumberOfLikes(new String[]{"Bling-Blong"});
        this.numberOfLikes5 = new NumberOfLikes(new String[]{});
    }

    @Test
    void getNumberOfLikes() {
        assertEquals("Ding-Dong, Bling-Blong and 2 users like this",
                this.numberOfLikes1.getNumberOfLikes()
        );
        assertEquals("Schling-Schlong and Garry like this",
                this.numberOfLikes2.getNumberOfLikes()
        );
        assertEquals("Bling-Blong, Schling-Schlong and Garry like this",
                this.numberOfLikes3.getNumberOfLikes()
        );
        assertEquals("Bling-Blong likes this",
                this.numberOfLikes4.getNumberOfLikes()
        );
        assertEquals("Nobody likes this",
                this.numberOfLikes5.getNumberOfLikes()
        );
    }
}