package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.RuntimeException;

class AppTest {

    @Test void tictactoeGivenXOutTableThenError(){
        Tictactoe gameUnderTest = new Tictactoe();

        assertThrows(RuntimeException.class, () ->gameUnderTest.play(5,2), "Runtime Error esperado");
    }

    @Test void tictactoeGivenYOutTableThenError(){
        Tictactoe gameUnderTest = new Tictactoe();

        assertThrows(RuntimeException.class, () ->gameUnderTest.play(2,5), "Runtime Error esperado");
    }

    @Test void tictactoeWhenCellNoEmptyThenError(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.table[0][0] = "X";

        assertThrows(RuntimeException.class, () -> gameUnderTest.checkIfEmpty(0, 0), "Runtime Error esperado");
    }

    @Test void tictactoeWhenStartThenPlayerX(){
        Tictactoe gameUnderTest = new Tictactoe();
        assertEquals("X", gameUnderTest.nextPlayer());
    }

    @Test void tictactoeWhenXThenO(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.actualPlayer = "X";
        assertEquals("O", gameUnderTest.nextPlayer());
    }

    @Test void tictactoeWhenOThenX(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.actualPlayer = "O";
        assertEquals("X", gameUnderTest.nextPlayer());
    }

    @Test void tictactoeNoWinnerDefault(){
        Tictactoe gameUnderTest = new Tictactoe();
        assertNull(gameUnderTest.checkWinner());
    }

    @Test void tictactoeWinnerHorizontal(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.actualPlayer = "X";
        gameUnderTest.table[0][0] = "X";
        gameUnderTest.table[0][1] = "X";
        gameUnderTest.table[0][2] = "X";
        assertEquals("X", gameUnderTest.checkWinner());
    }

    @Test void tictactoeWinnerVertical(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.actualPlayer = "X";
        gameUnderTest.table[0][0] = "X";
        gameUnderTest.table[1][0] = "X";
        gameUnderTest.table[2][0] = "X";
        assertEquals("X", gameUnderTest.checkWinner());
    }

    @Test void tictactoeWinnerFirstDiagonal(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.actualPlayer = "X";
        gameUnderTest.table[0][0] = "X";
        gameUnderTest.table[1][1] = "X";
        gameUnderTest.table[2][2] = "X";
        assertEquals("X", gameUnderTest.checkWinner());
    }

    @Test void tictactoeWinnerSecondDiagonal(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.actualPlayer = "X";
        gameUnderTest.table[2][0] = "X";
        gameUnderTest.table[1][1] = "X";
        gameUnderTest.table[0][2] = "X";
        assertEquals("X", gameUnderTest.checkWinner());
    }
    @Test void tictactoeDraw(){
        Tictactoe gameUnderTest = new Tictactoe();
        gameUnderTest.table[0][0] = "X";
        gameUnderTest.table[0][1] = "O";
        gameUnderTest.table[0][2] = "X";
        gameUnderTest.table[1][0] = "O";
        gameUnderTest.table[1][1] = "X";
        gameUnderTest.table[1][2] = "O";
        gameUnderTest.table[2][0] = "O";
        gameUnderTest.table[2][1] = "X";
        gameUnderTest.table[2][2] = "O";
        assertEquals("D", gameUnderTest.checkWinner());
    }
}
