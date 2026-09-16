package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarHasta10();

        System.out.println("Números leídos: " + numeros);
        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.println("Media: " + calcularMedia(numeros));
    }

    // Genera números aleatorios entre -10 y 10 hasta que salga incluso el número 10
    public static ArrayList<Integer> generarHasta10() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        int numero;

        do {
            numero = rand.nextInt(21) - 10; // rango -10 a 10
            lista.add(numero);
        } while (numero != 10);

        return lista;
    }

    // Suma todos los elementos del ArrayList
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int numero : lista) {
            suma += numero;
        }
        return suma;
    }

    // Calcula la media de los elementos del ArrayList
    public static double calcularMedia(ArrayList<Integer> lista) {
        return (double) calcularSuma(lista) / lista.size();
    }
}