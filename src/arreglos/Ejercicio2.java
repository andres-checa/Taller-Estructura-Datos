package arreglos;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] pares = generarPares(100);

        System.out.println("Impresión en una sola línea:");
        imprimirUnaLinea(pares);

        System.out.println("\nImpresión en 10 líneas:");
        imprimirPorLineas(pares, 10);
    }

    // Genera los primeros n números pares (0, 2, 4, 6, ...)
    public static int[] generarPares(int n) {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = i * 2;
        }
        return arreglo;
    }

    // Imprime todo el arreglo en una sola línea
    public static void imprimirUnaLinea(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    // Imprime el arreglo dividido en 'numLineas' líneas, indicando el número de línea
    public static void imprimirPorLineas(int[] arreglo, int numLineas) {
        int porLinea = arreglo.length / numLineas;
        int indice = 0;

        for (int linea = 1; linea <= numLineas; linea++) {
            System.out.print("Línea " + linea + ": ");
            for (int j = 0; j < porLinea; j++) {
                System.out.print(arreglo[indice] + " ");
                indice++;
            }
            System.out.println();
        }
    }
}
