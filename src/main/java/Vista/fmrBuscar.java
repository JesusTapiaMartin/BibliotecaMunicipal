package Vista;

import Controlador.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class fmrBuscar extends JDialog {
    private JPanel      jpBuscar;
    private JButton     btnPrestar;
    private JButton     btnSalir;
    private JButton     btnBuscar;
    private JTable      tblLibros;
    private JTextField  txtBuscar;
    private JButton     btnDevolver;
    private JScrollPane jsPane1;
    private JButton     btnListar;

    public fmrBuscar() {
        setModal(true);
        setTitle("Buscar Libro/Revista");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setContentPane(jpBuscar);
        crearTabla();
        cargarListadoMateriales(null);



        // ===== BOTÓN BUSCAR =====
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarMaterialPorNombre();
            }
        });



        // ===== BOTÓN LISTAR =====
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarListadoMateriales(null);
                limpiarBusqueda();
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


    // ===== TABLA =====
    private void crearTabla() {
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Titulo", "Autor", "Estado", "ISBN/ISSN"});
        tblLibros.setModel(modelo);

    }



    // ========== CARGAR LISTADO MATERIALES ==========
    private void cargarListadoMateriales(String filtro) {
        List<Object[]> librosData = csvLibros.listadoLibros(filtro);
        List<Object[]> revistasData = csvRevistas.listadoRevistas(filtro);

        DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();
        modelo.setRowCount(0);

        for (Object[] rowData : librosData) {
            if (rowData.length > 1) {
                Object[] rowDataWithoutId = new Object[rowData.length - 1];
                System.arraycopy(rowData, 1, rowDataWithoutId, 0, rowData.length - 1);
                modelo.addRow(rowDataWithoutId);
            }
        }

        for (Object[] rowData : revistasData) {
            if (rowData.length > 1) {
                Object[] rowDataWithoutId = new Object[rowData.length - 1];
                System.arraycopy(rowData, 1, rowDataWithoutId, 0, rowData.length - 1);
                modelo.addRow(rowDataWithoutId);
            }
        }
    }



    // ========== BUSCAR LIBRO O REVISTA POR NOMBRE ==========
    private void buscarMaterialPorNombre() {
        String filtro = txtBuscar.getText().toLowerCase();
        cargarListadoMateriales(filtro);
    }



    // ===== LIMPIAR BUSQUEDA =====
    public void limpiarBusqueda(){
        txtBuscar.setText(null);
    }
}