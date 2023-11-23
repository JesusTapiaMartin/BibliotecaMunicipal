package Controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Clases.*;

import javax.swing.*;

public class csvRevistas {

    // ===== ATRIBUTOS =====
    public static final String nombreArchivosRevista = "Revistas.csv";


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
            String idRevista        = nuevaRevista.getId();
            String tituloRevista    = nuevaRevista.getTitulo();
            String autorRevista     = nuevaRevista.getAutor();
            boolean estadoRevista   = nuevaRevista.isEstado();
            String issnRevista      = nuevaRevista.getISSN();
            int numeroRevista       = nuevaRevista.getNumero();


            // Agregar datos al final del archivo en modo append
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivosRevista, true));

            escritor.write( idRevista       + "," + tituloRevista   + "," + autorRevista + "," +
                            estadoRevista   + "," + issnRevista     + "," + numeroRevista);
            // ----- NUEVA LÍNEA DESPUÉS PARA AGREGAR UN ALUMNO -----
            escritor.newLine();
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }



    // ===== MOSTRAR REVISTAS CSV =====
    public static List<Object[]> listadoRevistas(String filtroIssn){
        List<Object[]> revistasData = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivosRevista));
            String linea;

            boolean primeraLinea = true;

            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }
                String[] campos = linea.split(",");

                if (campos.length >= 6) {
                    String idRevista        = campos[0].trim();
                    String tituloRevista    = campos[1].trim();
                    String autorRevista     = campos[2].trim();
                    boolean estadoRevista   = Boolean.parseBoolean(campos[3].trim());
                    String issnRevista      = campos[4].trim();
                    int numeroRevista       = Integer.parseInt(campos[5].trim());

                    if (filtroIssn == null || issnRevista.equals(filtroIssn)) {
                        Object[] rowData = {idRevista, tituloRevista, autorRevista, estadoRevista, issnRevista, numeroRevista};
                        revistasData.add(rowData);
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Hubo un error al leer el archivo: " + e.getMessage());
        }
        return revistasData;
    }



    // ===== ELIMINAR REVISTAS CSV =====
    public static void eliminarRevistasCsv(String issnRevista){
        try {
            File archivo = new File(nombreArchivosRevista);

            // Verificar si el archivo existe
            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(null, "El archivo de Revistas no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Scanner lector                  = new Scanner(archivo);
            File archivoTemp                = new File(nombreArchivosRevista + ".temp");
            BufferedWriter escritor         = new BufferedWriter(new FileWriter(archivoTemp));

            boolean revistaEncontrada       = false;


            while (lector.hasNextLine()) {
                String linea = lector.nextLine();


                if (linea.contains("," + issnRevista + ",")) {
                    revistaEncontrada = true;
                } else {
                    escritor.write(linea);
                    escritor.newLine();
                }
            }
            lector.close();
            escritor.close();

            // Eliminar el archivo original y renombrar el temporal
            archivo.delete();
            archivoTemp.renameTo(archivo);

            if (revistaEncontrada) {
                JOptionPane.showMessageDialog(null, " La revista de ISSN " + issnRevista + " fue eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una revista con ISSN " + issnRevista, "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la revista : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
