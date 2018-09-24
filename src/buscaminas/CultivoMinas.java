/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;

/**
 *
 * @author usuario
 */
public class CultivoMinas {

    int columnas;
    int filas;
    boolean Validacion;
    int mina = 5;
    int tablero[][] = new int[filas][columnas];

    void sembrador() {
        Random aleatorio = new Random();
        int x = filas;
        int y = columnas;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; i++) {
                tablero[i][j] = aleatorio.nextInt(10);

            }
        }

    }

    void Sabermina() {
        int x = filas;
        int y = columnas;
        for (int i = 0; i < x; i++) {
            for (int j = 0; i < y; i++) {
                if (mina == tablero[i][j]) {
                    System.out.println("mina encontrada");

                } else {
                    System.out.println("no hay nada");

                }
            }

        }
    }

}
