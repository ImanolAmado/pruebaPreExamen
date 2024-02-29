public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        Libro l1 = new Libro("El Quijote", "Cervantes", "97-8840806-1052",1560 , "Novela");
        Libro l2= new Libro("Los pilares de la Tierra", "Ken Follett", "97-5440806-1055", 1068, "Novela");
        Libro l3= new Libro("Libro de Poemas", "Federico Garcia Lorca", "97-5440806-1050", 164, "Poesia");
        
        biblioteca.añadirLibro(l3);
        biblioteca.añadirLibro(l1);
        biblioteca.añadirLibro(l2);
        biblioteca.mostrarLibros();
        biblioteca.mostrarGenero("Novela");
        biblioteca.mostrarLibroMasLargo();
        biblioteca.eliminarLibro("97-8840806-1052");
        biblioteca.mostrarLibros();
    }
}
