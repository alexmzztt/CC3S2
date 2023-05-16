package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GameTest {

    @Test
    public void boardSizeInvalid() {
        SOS gameUnderTest = new SOS();
        assertThrows(IllegalArgumentException.class, () -> gameUnderTest.boardSize(2));
    }


}