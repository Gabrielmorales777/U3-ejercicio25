
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MaterialBiblioteca> catalogo = new ArrayList<>();

        Libro libro1 = new Libro(
                "El principito", 1943, "Reynal & Hitchcock",
                "Antoine de Saint-Exupéry", 96
        );

        Libro libro2 = new Libro(
                "Don Quijote de la Mancha", 1605, "Francisco de Robles",
                "Miguel de Cervantes", 863
        );

        Revista revista1 = new Revista(
                "National Geographic", 2025, "National Geographic Society",
                125, "Marzo"
        );

        Revista revista2 = new Revista(
                "Muy Interesante", 2024, "Zinet Media",
                410, "Agosto"
        );

        catalogo.add(libro1);
        catalogo.add(libro2);
        catalogo.add(revista1);
        catalogo.add(revista2);

        System.out.println("=== CATÁLOGO DE LA BIBLIOTECA ===");

        for (MaterialBiblioteca material : catalogo) {
            material.mostrarInformacion();
            System.out.println();
        }
    }
}
