package Vista;

import Clases.*;
import Controlador.*;
import javax.swing.*;
import java.awt.event.*;

public class fmrMateriales extends JDialog {

    // ===== ATRIBUTOS =====
    private Libro   nuevoLibro;
    private Revista nuevaRevista;
    public static int contadorLibro     = 0;
    public static int contadorRevista   = 0;

    private JPanel          contentPane;
    private JTextField      txtTituloLibro;
    private JButton         btnAgregarLibro;
    private JButton         btnSalir;
    private JTextField      txtTituloRevista;
    private JButton         btnAgregarRevista;
    private JTextField      txtAutorLibro;
    private JTextField      txtISBN;
    private JLabel          lblTituloLibro;
    private JLabel          lblAutorLibro;
    private JLabel          lblISBN;
    private JTextField      txtAutorRevista;
    private JTextField      txtISSN;
    private JLabel          lblTituloRevista;
    private JLabel          lblISSN;
    private JTextField      txtEdicion;
    private JTextField      txtNumero;
    private JLabel          lblEdicion;
    private JLabel          lblNumero;
    private JButton         buttonOK;
    private JButton         buttonCancel;

    public fmrMateriales() {
        setModal(true);
        setTitle("Agregar Material");
        setSize(900, 200);
        setLocationRelativeTo(null);
        setContentPane(contentPane);


        // ===== BOTÓN AGREGAR LIBRO =====
        btnAgregarLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarCamposLibro()) {
                    Libro nuevoLibro = grabarLibro();
                    setNuevoLibro(nuevoLibro);
                    grabarLibro();
                    Controlador.csvLibros.agregarLibroCsv(nuevoLibro);
                    JOptionPane.showMessageDialog(null, " Libro agregado correctamente ");
                    limpiarLibro();
                }
            }
        });


        // ===== BOTÓN AGREGAR REVISTA =====
        btnAgregarRevista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarCamposRevista()) {
                    Revista nuevaRevista = grabarRevista();
                    setNuevaRevista(nuevaRevista);}
                    grabarRevista();
                    Controlador.csvRevistas.agregarRevistaCsv(nuevaRevista);
                    JOptionPane.showMessageDialog(null, " Revista agregado correctamente ");
                    limpiarRevista();
            }
        });



        // ===== BOTÓN SALIR =====
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


    // ===== GRABAR LIBRO =====
    Libro grabarLibro() {
        String idLibro      = Integer.toString(contadorLibro++);
        String tituloLibro  = txtTituloLibro.getText();
        String autorLibro   = txtAutorLibro.getText();
        Boolean estadoLibro = true;
        String isbnLibro    = txtISBN.getText();
        String edicionLibro = txtEdicion.getText();

        Libro nuevoLibro = new Libro(   idLibro     , tituloLibro   , autorLibro,
                                        estadoLibro , isbnLibro     , edicionLibro);

        return nuevoLibro;
    }


    // ===== GRABAR REVISTA =====
    Revista grabarRevista(){
        String idRevista        = Integer.toString(contadorRevista++);
        String tituloRevista    = txtTituloRevista.getText();
        String autorRevista     = txtAutorRevista.getText();
        Boolean estadoRevista   = true;
        String issnRevista      = txtISSN.getText();
        int numeroRevista       = Integer.parseInt(txtNumero.getText());

        Revista nuevaRevista    = new Revista(  idRevista       , tituloRevista     , autorRevista      ,
                                                estadoRevista   , issnRevista       , numeroRevista);

        return nuevaRevista;
    }



    // ===== VALIDAR CAMPOS LIBRO =====
    private boolean validarCamposLibro(){
        if( txtTituloLibro  .getText().isEmpty() ||
            txtAutorLibro   .getText().isEmpty() ||
            txtISBN         .getText().isEmpty() ||
            txtEdicion      .getText().isEmpty()
        ){
            JOptionPane.showMessageDialog(this, " [LIBRO] Faltan campos por rellenar", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


    // ===== VALIDAR CAMPOS REVISTA =====
    private boolean validarCamposRevista(){
        if( txtTituloRevista.getText().isEmpty() ||
            txtAutorRevista .getText().isEmpty() ||
            txtISSN         .getText().isEmpty() ||
            txtNumero       .getText().isEmpty()
        ){
            JOptionPane.showMessageDialog(this, " [REVISTA] Faltan campos por rellenar", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }



    // ===== LIMPIAR CAMPOS DE LIBRO =====
    public void limpiarLibro(){
        txtTituloLibro  .setText(null);
        txtAutorLibro   .setText(null);
        txtISBN         .setText(null);
        txtEdicion      .setText(null);
    }



    // ===== LIMPIAR CAMPOS DE REVISTA =====
    public void limpiarRevista(){
        txtTituloRevista    .setText(null);
        txtAutorRevista     .setText(null);
        txtISSN             .setText(null);
        txtNumero           .setText(null);
    }



    // ===== SET NUEVO LIBRO =====
    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro     = nuevoLibro;
    }


    // ===== SET NUEVA REVISTA =====
    public void setNuevaRevista(Revista nuevaRevista) {
        this.nuevaRevista   = nuevaRevista;
    }
}

