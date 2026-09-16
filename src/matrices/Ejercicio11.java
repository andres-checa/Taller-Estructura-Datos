package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(m, n, 1, 100);
        imprimirMatriz(matriz);

        System.out.print("\nIngrese el número a buscar: ");
        int buscado = sc.nextInt();

        buscarNumero(matriz, buscado);

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

    // Imprime la matriz completa
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    // Busca la primera ocurrencia de un número en la matriz y muestra el resultado
    public static void buscarNumero(int[][] matriz, int buscado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == buscado) {
                    System.out.println("El número " + buscado
                            + " se encontró en la posición [fila " + i + ", columna " + j + "]");
                    return;
                }
            }
        }
        System.out.println("El número " + buscado + " no se encontró en la matriz.");
    }
}