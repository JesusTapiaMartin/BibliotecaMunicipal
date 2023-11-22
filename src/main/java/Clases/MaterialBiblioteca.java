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
}
