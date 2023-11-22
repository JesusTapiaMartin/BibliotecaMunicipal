package Clases;

public class Usuario {

    // ===== ATRIBUTOS =====
    private String idUsuario, nombre, email;



    // ===== CONSTRUCTOR =====
    public Usuario(String idUsuario, String nombre, String email) {
        this.idUsuario  = idUsuario;
        this.nombre     = nombre;
        this.email      = email;
    }



    // ===== GETTER Y SETTER =====
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
