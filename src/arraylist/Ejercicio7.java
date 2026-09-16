package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> pares = generarPares(20);
        System.out.println("ArrayList inicial: " + pares);

        System.out.print("\nIngrese un número para insertar: ");
        int nuevo = sc.nextInt();
        insertarOrdenado(pares, nuevo);
        System.out.println("ArrayList después de insertar: " + pares);

        System.out.print("\nIngrese un número para borrar: ");
        int aBorrar = sc.nextInt();
        boolean borrado = pares.remove(Integer.valueOf(aBorrar));
        if (borrado) {
            System.out.println("ArrayList después de borrar: " + pares);
        } else {
            System.out.println("El número " + aBorrar + " no estaba en la lista.");
        }

        sc.close();
    }

    // Genera un ArrayList con los primeros n números pares (0, 2, 4, ...)
    public static ArrayList<Integer> generarPares(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(i * 2);
        }
        return lista;
    }

    // Inserta 'valor' en la posición correcta para mantener el orden ascendente
    public static void insertarOrdenado(ArrayList<Integer> lista, int valor) {
        int i = 0;
        while (i < lista.size() && lista.get(i) < valor) {
            i++;
        }
        lista.add(i, valor);
    }
}