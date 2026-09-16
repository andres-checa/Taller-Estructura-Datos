package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(m, n, 1, 100);

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        intercambiarFilas(matriz, 0, 1);

        System.out.println("\nMatriz con la primera y segunda fila intercambiadas:");
        imprimirMatriz(matriz);

        sc.close();
    }

    // Genera una matriz m x n con valores aleatorios entre min y max
    public static int[][] generarMatriz(int m, int n, int min, int max) {
        Random rand = new Random();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
        return matriz;
    }

    // Intercambia dos filas cualesquiera de la matriz
    public static void intercambiarFilas(int[][] matriz, int fila1, int fila2) {
        int[] temp = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = temp;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}