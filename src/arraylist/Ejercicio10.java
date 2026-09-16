package arraylist;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

    private static final String NOMBREFICHERO = "src/arraylist/PartidoLiga.txt";

    public static void main(String[] args) throws Exception {
        ArrayList<PartidoFutbol> partidos = cargarPartidos();
        System.out.println("Total de partidos cargados: " + partidos.size());

        System.out.println("\n--- Partidos donde ganó el visitante ---");
        mostrarGanadosPorVisitante(partidos);

        int vecesBarcelona = contarVictorias(partidos, "Barcelona");
        System.out.println("\nEl Barcelona ganó " + vecesBarcelona + " partidos.");

        int localesGanadores = contarVictoriasLocal(partidos);
        System.out.println("El equipo local ganó en " + localesGanadores + " partidos.");

        eliminarNoEmpates(partidos);
        System.out.println("\nPartidos restantes (solo empates): " + partidos.size());
    }

    public static ArrayList<PartidoFutbol> cargarPartidos() {
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        File fichero = new File(NOMBREFICHERO);

        try (Scanner leer = new Scanner(fichero)) {
            while (leer.hasNext()) {
                String linea = leer.nextLine();
                String[] datos = linea.split("::");
                PartidoFutbol partido = new PartidoFutbol();
                partido.setEquipoLocal(datos[0]);
                partido.setEquipoVisitante(datos[1]);
                partido.setGalLocal(Integer.parseInt(datos[2]));
                partido.setGolVisitante(Integer.parseInt(datos[3]));
                partidos.add(partido);
            }
        } catch (Exception e) {
            System.out.println("El fichero no se puede leer.");
        }
        return partidos;
    }

    public static void mostrarGanadosPorVisitante(ArrayList<PartidoFutbol> partidos) {
        for (PartidoFutbol p : partidos) {
            if (p.getGolVisitante() > p.getGalLocal()) {
                System.out.println(p.getEquipoLocal() + " " + p.getGalLocal()
                        + " - " + p.getGolVisitante() + " " + p.getEquipoVisitante());
            }
        }
    }

    public static int contarVictorias(ArrayList<PartidoFutbol> partidos, String equipo) {
        int contador = 0;
        for (PartidoFutbol p : partidos) {
            boolean ganoDeLocal = p.getEquipoLocal().equals(equipo) && p.getGalLocal() > p.getGolVisitante();
            boolean ganoDeVisitante = p.getEquipoVisitante().equals(equipo) && p.getGolVisitante() > p.getGalLocal();
            if (ganoDeLocal || ganoDeVisitante) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarVictoriasLocal(ArrayList<PartidoFutbol> partidos) {
        int contador = 0;
        for (PartidoFutbol p : partidos) {
            if (p.getGalLocal() > p.getGolVisitante()) {
                contador++;
            }
        }
        return contador;
    }

    public static void eliminarNoEmpates(ArrayList<PartidoFutbol> partidos) {
        partidos.removeIf(p -> p.getGalLocal() != p.getGolVisitante());
    }

    // Clase interna: representa un partido de fútbol
    static class PartidoFutbol {
        private String equipoLocal;
        private String equipoVisitante;
        private int galLocal;
        private int golVisitante;

        public String getEquipoLocal() { 
            return equipoLocal; }
        public void setEquipoLocal(String equipoLocal) { 
            this.equipoLocal = equipoLocal; }
        public String getEquipoVisitante() { 
            return equipoVisitante; }
        public void setEquipoVisitante(String equipoVisitante) { 
            this.equipoVisitante = equipoVisitante; }
        public int getGalLocal() {
            return galLocal; }
        public void setGalLocal(int galLocal) { 
            this.galLocal = galLocal; }
        public int getGolVisitante() {
            return golVisitante; }
        public void setGolVisitante(int golVisitante) {
            this.golVisitante = golVisitante; }

    public PartidoFutbol(String equipoLocal, String equipoVisitante, int galLocal, int golVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.galLocal = galLocal;
        this.golVisitante = golVisitante;
    }

    public PartidoFutbol() {
    }
    
    }

}
