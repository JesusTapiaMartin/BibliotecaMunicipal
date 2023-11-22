package Controlador;

import java.io.*;
import Clases.*;

public class Csv {

    // ===== ATRIBUTOS =====
    public static final String nombreArchivoLibros      = "Libros.csv";
    public static final String nombreArchivosRevista    = "Revistas.csv";



    // ===== AGREGAR LIBRO CSV =====
    public static void agregarLibroCsv(Libro nuevoLibro) {
        try {
            File archivo = new File(nombreArchivoLibros);

            // ----- SI EL ARCHIVO NO EXISTE-----
            if (!archivo.exists()) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoLibros));

                // ----- Encabezados -----
                escritor.write("ID, TITULO, AUTOR, ESTADO, ISBN, EDICION");
                escritor.newLine();
                escritor.close();
            }

            // ===== ATRIBUTOS LIBRO =====
            String edicionLibro     = nuevoLibro.getEdicion();
            String isbnLibro        = nuevoLibro.getISBN();


                // Agregar datos al final del archivo en modo append
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoLibros, true));
            escritor.write( edicionLibro + "," + isbnLibro );


            // ----- NUEVA LÍNEA DESPUÉS PARA AGREGAR UN ALUMNO -----
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }


    // ===== AGREGAR REVISTA CSV =====
    public static void agregarRevistaCsv(Revista nuevaRevista) {
        try {
            File archivo = new File(nombreArchivosRevista);

            // ----- SI EL ARCHIVO NO EXISTE-----
            if (!archivo.exists()) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivosRevista));

                // ----- Encabezados -----
                escritor.write("ID, TITULO, AUTOR, ESTADO, ISSN, NUMERO");
                escritor.newLine();
                escritor.close();
            }

            // ===== ATRIBUTOS =====
            String  issnRevista      = nuevaRevista.getISSN();
            int     numeroRevista    = nuevaRevista.getNumero();


            // Agregar datos al final del archivo en modo append
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivosRevista, true));

            escritor.write(issnRevista + "," + numeroRevista);
            // ----- NUEVA LÍNEA DESPUÉS PARA AGREGAR UN ALUMNO -----
            escritor.newLine();
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }
}
