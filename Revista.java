
public class Revista extends MaterialBiblioteca {

    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, int anioEdicion, String editorial,
                   int numeroEdicion, String mesPublicacion) {

        super(titulo, anioEdicion, editorial);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== REVISTA ===");
        super.mostrarInformacion();
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
    }
}
