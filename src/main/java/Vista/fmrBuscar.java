package Vista;

import javax.swing.*;

public class fmrBuscar extends JDialog {
    private JPanel jpBuscar;
    private JButton btnPrestar;
    private JButton btnSalir;
    private JButton btnBuscar;
    private JTable tblLibros;
    private JTextField txtBuscar;
    private JButton btnDevolver;

    public fmrBuscar() {
        setVisible(true);
        setContentPane(jpBuscar);
        setModal(true);
        setTitle("Buscar Materiales");
        setSize(600, 600);
    }

}
