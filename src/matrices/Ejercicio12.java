package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(n, -50, 50);
        imprimirMatriz(matriz);

        int suma = sumarDiagonalOpuesta(matriz);
        System.out.println("\nSuma de la diagonal opuesta: " + suma);

        sc.close();
    }

    // Genera una matriz n x n con valores aleatorios entre min y max
    public static int[][] generarMatriz(int n, int min, int max) {
        Random rand = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
        return matriz;
    }

    // Suma los elementos de la diagonal opuesta a la principal
    public static int sumarDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }
}