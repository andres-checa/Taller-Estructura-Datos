package arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Ejercicio8 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarNumeros(100, 1, 20);
        HashMap<Integer, Integer> frecuencias = calcularFrecuencias(numeros);

        imprimirTabla(frecuencias);

        int masFrecuente = encontrarMasFrecuente(frecuencias);
        System.out.println("\nEl número que más se repite es: " + masFrecuente
                + " (aparece " + frecuencias.get(masFrecuente) + " veces)");
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

    // Recorre la lista y cuenta cuántas veces aparece cada número
    public static HashMap<Integer, Integer> calcularFrecuencias(ArrayList<Integer> lista) {
        HashMap<Integer, Integer> frecuencias = new HashMap<>();
        for (int numero : lista) {
            frecuencias.put(numero, frecuencias.getOrDefault(numero, 0) + 1);
        }
        return frecuencias;
    }

    // Imprime la tabla de número - frecuencia, ordenada por número
    public static void imprimirTabla(HashMap<Integer, Integer> frecuencias) {
        System.out.println("Número | Frecuencia");
        System.out.println("-------------------");
        for (int numero = 1; numero <= 20; numero++) {
            int frecuencia = frecuencias.getOrDefault(numero, 0);
            System.out.printf("%-6d | %d%n", numero, frecuencia);
        }
    }

    // Encuentra el número con mayor frecuencia
    public static int encontrarMasFrecuente(HashMap<Integer, Integer> frecuencias) {
        int numeroMasFrecuente = -1;
        int mayorFrecuencia = -1;
        for (Integer numero : frecuencias.keySet()) {
            if (frecuencias.get(numero) > mayorFrecuencia) {
                mayorFrecuencia = frecuencias.get(numero);
                numeroMasFrecuente = numero;
            }
        }
        return numeroMasFrecuente;
    }
}