package arreglos;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] numeros = generarNumeros(25, -50, 50);

        System.out.println("Arreglo generado:");
        imprimirArreglo(numeros);

        System.out.println("Número menor: " + encontrarMenor(numeros));
        System.out.println("Número mayor: " + encontrarMayor(numeros));
    }

    // Genera 'cantidad' números aleatorios entre min y max (incluso ambos)
    public static int[] generarNumeros(int cantidad, int min, int max) {
        Random rand = new Random();
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arreglo;
    }

    // Recorre el arreglo y devuelve el valor más pequeño
    public static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    // Recorre el arreglo y devuelve el valor más grande
    public static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}