package Clases;

public class Revista extends MaterialBiblioteca{

    // ===== ATRIBUTOS =====
    private String ISSN;
    private int numero;



    // ===== CONSTRUCTOR =====
    public Revista( String id       , String titulo     ,
                    String autor    , boolean estado    ,
                    String ISSN     , int numero        ) {
        super(id, titulo, autor, estado);
        this.ISSN   = ISSN;
        this.numero = numero;
    }



    // ===== GETTER Y SETTER =====
    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
