package Clases;

public class Libro extends MaterialBiblioteca{

    // ===== ATRIBUTOS =====
    private String ISBN, edicion;



    // ===== CONSTRUCTORES =====
    public Libro(String ISBN, String edicion) {
        this.ISBN = ISBN;
        this.edicion = edicion;
    }

    public Libro() {
    }



    // ===== GETTER Y SETTER =====
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
