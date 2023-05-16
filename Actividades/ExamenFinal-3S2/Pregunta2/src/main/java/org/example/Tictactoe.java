package org.example;

public class Tictactoe {
    public String[][] table = {
            {"\0", "\0", "\0"},
            {"\0", "\0", "\0"},
            {"\0", "\0", "\0"},
    };

    public String actualPlayer;
    public String Winner;

    Tictactoe() {
    }

    public void play(int x, int y) {

        nextPlayer();

        int realX = x - 1;
        int realY = y - 1;

        checkIfOutTable(realX, realY);
        checkIfEmpty(realX, realY);

        table[realX][realY] = actualPlayer;
    }

    public void checkIfOutTable(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            throw new RuntimeException("La casilla esta fuera de los limites");
        }
    }

    public void checkIfEmpty(int x, int y) {
        if (this.table[x][y] != "\0") {
            throw new RuntimeException("La casilla esta llena");
        }
    }

    public String nextPlayer() {
        if (this.actualPlayer == null) {
            actualPlayer = "X";
            return actualPlayer;
        }
        switch (this.actualPlayer) {
            case "X":
                actualPlayer = "O";
                break;

            case "O":
                actualPlayer = "X";
                break;
        }
        return actualPlayer;

    }

    public String checkWinner() {
        //todo lleno
        //filas
        for (int i = 0; i < 3; i++) {
            if(
                    actualPlayer == table[i][0] &&
                            actualPlayer == table[i][1] &&
                            actualPlayer == table[i][2] )
            {
                Winner = actualPlayer;
                return Winner;
            }
        }
        //columnas
        for (int i = 0; i < 3; i++) {
            if(
                    actualPlayer == table[0][i] &&
                            actualPlayer == table[1][i] &&
                            actualPlayer == table[2][i] )
            {
                Winner = actualPlayer;
                return Winner;
            }
        }

        //primera diagonal
        if(
                actualPlayer == table[0][0] &&
                        actualPlayer == table[1][1] &&
                        actualPlayer == table[2][2] )
        {
            Winner = actualPlayer;
            return Winner;
        }

        //Segunda diagonal
        if(
                actualPlayer == table[2][0] &&
                        actualPlayer == table[1][1] &&
                        actualPlayer == table[0][2] )
        {
            Winner = actualPlayer;
            return Winner;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                if(table[1][j] == "\0"){
                    Winner = null;
                    return Winner;
                }
                else{
                    Winner  = "D";
                }
            }
        }

        return Winner;
    }

}