package Vista;

import javax.swing.*;

public class fmrMenu extends JFrame {
    private JButton btnBuscar;
    private JButton btnMateriales;
    private JPanel jpMenu;
    private JButton btnSalir;

    public fmrMenu(){
        setVisible(true);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Menú");
        setContentPane(jpMenu);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
