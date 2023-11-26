package Vista;

import javax.swing.*;

public class fmrBuscar extends JDialog {
    private JPanel jpBuscar;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public fmrBuscar() {
        setVisible(true);
        setContentPane(jpBuscar);
        setModal(true);
        setTitle("Buscar Materiales");
        setSize(600, 600);
    }

}
