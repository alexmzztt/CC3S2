package org.example;

public class Board {
    int row;
    int column;
    String[][] array;

    //creamos el tablero
    void iniBoard(int r, int c) {
        row = r;
        column = c;
        array = new String[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = " ";
            }
        }
    }

    //imprimimos el tablero
    void printBoard() {
        System.out.print("\n  | ");

        for (int i = 1; i <= row; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------");
        for (int i = 0; i < row; i++) {
            System.out.print(i+1 + " | ");
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    //obtenemos datos de la celda
    String getCell(int i, int j) {
        return array[i][j];
    }

    //verificamos si esta vacia
    boolean isEmpty(int r, int c) {
        return getCell(r,c).equals(" ");
    }


}