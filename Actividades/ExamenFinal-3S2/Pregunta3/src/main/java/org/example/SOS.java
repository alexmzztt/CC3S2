package org.example;

import java.util.Scanner;

public class SOS {

    //inicia el juego
    static void start() {
        Board board = new Board();
        Scanner scan = new Scanner(System.in);

        //pide el tamaño del tablero
        System.out.print("Ingrese el tamañodel tablero siendo el minimo 3x3 : ");
        int size = scan.nextInt();

        if (size < 3) { //si se ingresa un numero menor a 3 entonces el tamaño se asigna a 3
            System.out.println("Como ingresó un numero menor a 3, el tamaño del tablero asignado sera 3");
            size = 3;
        }

        //modo de juego
        System.out.print("Ingrese el modo de juego siendo 1=modo simple y 2=modo general : ");
        int modo = scan.nextInt();
        while (modo < 1 || modo > 2) { //si el numero no es 1 ni 2 pide ingresar un modo de juego valido
            System.out.println("Ingrese un modo de juego valido");
            modo = scan.nextInt();
        }

        //tablero
        board.iniBoard(size,size);


    }
}
