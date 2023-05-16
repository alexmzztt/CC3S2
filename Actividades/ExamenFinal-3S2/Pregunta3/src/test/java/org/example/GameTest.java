package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class GameTest {

    @Test void boardSize(){
        Board iniBoardUnderTest = new Board();
        assertEquals("4", iniBoardUnderTest);
    }

}