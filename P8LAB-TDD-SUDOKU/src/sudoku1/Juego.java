/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku1;

/**
 *
 * @author Dani
 */
public class Juego {

    private int[][] tablero;
    private static final int sin_asignar = 0;

    public Juego(int[][] tablero) {
        this.tablero = tablero;
    }

    public boolean resolverSudoku() {

        if (this.tablero.length == 1) {
            return true;
        }

        for (int fila = 0; fila < tablero.length; fila++) {
            for (int colum = 0; colum < tablero.length; colum++) {

                if (tablero[fila][colum] == this.sin_asignar) {

                    for (int numero = 1; numero <= tablero.length; numero++) {

                        if (validar(fila, colum, numero)) {

                            tablero[fila][colum] = numero;

                            if (resolverSudoku()) {
                                return true;
                            } else {
                                tablero[fila][colum] = sin_asignar;
                            }

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean existeEnFila(int fila, int numero) {
        for (int i = 0; i < this.tablero.length; i++) {
            if (tablero[fila][i] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean existeEnColum(int colum, int numero) {
        for (int i = 0; i < this.tablero.length; i++) {
            if (tablero[i][colum] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean existeEnMatriz(int fila, int colum, int numero) {
        int tamano = (int) Math.sqrt(this.tablero.length);

        int f = fila - fila % tamano;
        int c = colum - colum % tamano;
        for (int i = f; i < f + tamano; i++) {
            for (int j = c; j < c + tamano; j++) {
                if (tablero[i][j] == numero) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean validar(int fila, int colum, int numero) {
        return !(existeEnFila(fila, numero) || existeEnColum(colum, numero) || existeEnMatriz(fila, colum, numero));
    }

    public void imprimir() {
        int tamano = (int) Math.sqrt(this.tablero.length);
        for (int i = 0; i < this.tablero.length; i++) {
            if (i % tamano == 0 && i != 0) {
                System.out.println("-----------------------------------");
            }
            for (int j = 0; j < this.tablero.length; j++) {
                if (j % tamano == 0 && j != 0) {
                    System.out.print("|");
                }
                System.out.print(" " + this.tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int sumaTotal() {
        int suma = 0;
        int tamano = (int) Math.sqrt(this.tablero.length);
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                suma = suma + tablero[i][j];
            }
            System.out.println();
        }
        return suma;
    }
}
