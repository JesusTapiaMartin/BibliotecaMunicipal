package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class fmrBuscar extends JDialog {
    private JPanel      jpBuscar;
    private JButton     btnPrestar;
    private JButton     btnSalir;
    private JButton     btnBuscar;
    private JTable      tblLibros;
    private JTextField  txtBuscar;
    private JButton     btnDevolver;
    private JScrollPane jsPane1;

    public fmrBuscar() {
        crearTabla();
        setVisible(true);
        setContentPane(jpBuscar);
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Buscar");
        setSize(600, 600);
    }


    // ===== TABLA =====
    private void crearTabla(){
        tblLibros.setModel(new DefaultTableModel(null, new String[]{"Titulo","Autor","ISBN","ISSN"}));
    }


}
