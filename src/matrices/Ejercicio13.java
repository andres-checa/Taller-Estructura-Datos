package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(n, 1, 20);
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("\nLa matriz SÍ es simétrica.");
        } else {
            System.out.println("\nLa matriz NO es simétrica.");
        }

        imprimirEsquinas(matriz);

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

    // Verifica si la matriz es igual a su transpuesta (simétrica)
    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
    for (int[] fila : matriz) {
        for (int valor : fila) {
            System.out.printf("%4d", valor);
        }
        System.out.println();
    }
}

    // Imprime los cuatro valores de las esquinas de la matriz
    public static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;
        System.out.println("\nEsquinas de la matriz:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][m - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][m - 1]);
    }
}