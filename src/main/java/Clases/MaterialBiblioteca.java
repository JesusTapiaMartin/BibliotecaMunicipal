package Clases;

public class MaterialBiblioteca {

    // ===== ATRIBUTOS =====
    private String  id      , titulo      , autor;
    private boolean estado;



    // ===== CONSTRUCTOR =====
    public MaterialBiblioteca(  String id       , String titulo     ,
                                String autor    , boolean estado    ) {
        this.id         = id;
        this.titulo     = titulo;
        this.autor      = autor;
        this.estado     = estado;
    }



    // ===== GETTER Y SETTER =====
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
