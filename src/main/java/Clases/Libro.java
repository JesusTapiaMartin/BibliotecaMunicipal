package Clases;

public class Libro extends MaterialBiblioteca{

    // ===== ATRIBUTOS =====
    private String ISBN, edicion;



    // ===== CONSTRUCTORES =====
    public Libro(   String id       , String titulo     , String autor,
                    boolean estado  , String ISBN       , String edicion) {
        super(id, titulo, autor, estado);
        this.ISBN       = ISBN;
        this.edicion    = edicion;
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
