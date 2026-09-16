package arreglos;

import java.util.Random;

public class Ejercicio5{

    public static void main(String[] args) {
        int[] numeros = generarNumeros(20, 1, 9999);
        int[] invertidos = invertirArreglo(numeros);

        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        System.out.println("Arreglo con números invertidos:");
        imprimirArreglo(invertidos);
    }

    // Genera 'cantidad' números aleatorios entre min y max
    public static int[] generarNumeros(int cantidad, int min, int max) {
        Random rand = new Random();
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arreglo;
    }

    // Recorre el arreglo e invierte los dígitos de cada número
    public static int[] invertirArreglo(int[] arreglo) {
        int[] invertidos = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertidos[i] = invertirDigitos(arreglo[i]);
        }
        return invertidos;
    }

    // Invierte los dígitos de un solo número
    public static int invertirDigitos(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}