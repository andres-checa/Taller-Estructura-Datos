package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9_OrdenarSeparar {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarNumeros(20, 1, 100);
        System.out.println("Lista original: " + numeros);

        ArrayList<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente);
        System.out.println("\nOrdenada ascendente: " + ascendente);

        ArrayList<Integer> descendente = new ArrayList<>(numeros);
        Collections.sort(descendente, Collections.reverseOrder());
        System.out.println("Ordenada descendente: " + descendente);

        ArrayList<Integer> pares = filtrarPares(numeros);
        ArrayList<Integer> impares = filtrarImpares(numeros);
        System.out.println("\nNúmeros pares: " + pares);
        System.out.println("Números impares: " + impares);
    }

    // Genera 'cantidad' números aleatorios entre min y max
    public static ArrayList<Integer> generarNumeros(int cantidad, int min, int max) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add(rand.nextInt((max - min) + 1) + min);
        }
        return lista;
    }

    // Devuelve una nueva lista solo con los números pares
    public static ArrayList<Integer> filtrarPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int numero : lista) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        return pares;
    }

    // Devuelve una nueva lista solo con los números impares
    public static ArrayList<Integer> filtrarImpares(ArrayList<Integer> lista) {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero : lista) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }
        return impares;
    }
}