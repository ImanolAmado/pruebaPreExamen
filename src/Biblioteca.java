
public class Biblioteca {
    
    private Libro[] listaLibros;

    public Biblioteca() {
        listaLibros = new Libro[100];
       
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public boolean añadirLibro(Libro libro) {

        for (int i = 0; i < 100; i++) {
            if (listaLibros[i] == null) {
                listaLibros[i]=libro;               
                return true;
            }
        }
        return false;
    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String isbn) {
        for (int i = 0; i < 100; i++) {
           
            if (listaLibros[i] != null && listaLibros[i].getIsbn().equals(isbn)){
                listaLibros[i]=null;
                break;
            }            
        }
    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Los libros de la biblioteca son:");
        for (int i = 0; i < 100; i++) {
            if (listaLibros[i] != null) {
              System.out.println(listaLibros[i].toString());
            }
        }
    }

   
    // Muestra libros con genero pasado como parámetro
    public void mostrarGenero(String genero) {
        System.out.println("Los libros de " + genero + " de la biblioteca son:");
        for (int i = 0; i < 100; i++) {

            if (listaLibros[i] != null && listaLibros[i].getGenero().equals(genero)) {
                System.out.println(listaLibros[i].toString());
            }
        }      
    }


    // Nos devuelve un array con los libros de un autor
    public Libro[] librosDeAutor(String autor) {
        System.out.println("Los libros del autor:" + autor + " son:");
        Libro[] librosAutor = new Libro[100];
        int contador = 0;
        for (int i = 0; i < 100; i++) {

            if (listaLibros[i] != null && listaLibros[i].getAutor().equals(autor)) {
                librosAutor[contador] = listaLibros[i];
                contador++;
            }

        }
        return librosAutor;
    }

    // Nos devuelve el titulo del libro con mas paginas
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo="";
        for (int i = 0; i < 100; i++) {
            if (listaLibros[i] != null && listaLibros[i].getNumPaginas() > max) {
                max = listaLibros[i].getNumPaginas();
                titulo = listaLibros[i].getTitulo();
            }
        }
       System.out.println("El libro mas largo es: "+ titulo);
    }

}
