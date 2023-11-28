package Controlador;

import Clases.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class csvUsuarios {

    // ===== ATRIBUTOS =====
    public static final String nombreArchivoUsuarios = "Usuarios.csv";


    // ===== AGREGAR USUARIO CSV =====
    public static void agregarUsuarioCsv(Usuario nuevoUsuario) {
        try{
            File archivo = new File(nombreArchivoUsuarios);

            // ----- SI EL ARCHIVO NO EXISTE-----
            if (!archivo.exists()) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoUsuarios));

                // ----- Encabezados -----
                escritor.write("ID, NOMBRE, EMAIL");
                escritor.newLine();
                escritor.close();
            }


            // ===== ATRIBUTOS LIBRO =====
            String idUsuario        = nuevoUsuario.getIdUsuario();
            String nombreUsuario    = nuevoUsuario.getNombre();
            String emailUsuario     = nuevoUsuario.getEmail();


            // Agregar datos al final del archivo en modo append
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoUsuarios, true));
            escritor.write(idUsuario + "," + nombreUsuario + "," + emailUsuario);


            // ----- NUEVA LÍNEA DESPUÉS PARA AGREGAR UN ALUMNO -----
            escritor.newLine();
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }
}
