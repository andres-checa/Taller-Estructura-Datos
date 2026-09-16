package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuántos números desea generar: ");
        int n = sc.nextInt();
        sc.close();

        int[] numeros = generarNumeros(n);
        long[] factoriales = calcularFactoriales(numeros);

        System.out.println("Arreglo de números:");
        imprimirArreglo(numeros);

        System.out.println("Arreglo de factoriales:");
        imprimirArreglo(factoriales);
    }

    // Genera n números aleatorios entre 0 y 12 para evitar desbordes en el factorial
    public static int[] generarNumeros(int n) {
        Random rand = new Random();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(13); // 0 a 12
        }
        return arreglo;
    }

    // Calcula el factorial de cada número del arreglo
    public static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }
        return factoriales;
    }

    // Calcula el factorial de un solo número
    public static long factorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void imprimirArreglo(long[] arreglo) {
        for (long numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
