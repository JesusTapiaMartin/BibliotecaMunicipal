package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fmrMenu extends JFrame {
    private JButton     btnBuscar;
    private JButton     btnMateriales;
    private JPanel      jpMenu;
    private JButton     btnSalir;

    public fmrMenu(){
        setVisible(true);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Menú");
        setContentPane(jpMenu);


        // ===== BOTÓN SALIR =====
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        // ===== BOTÓN BUSCAR =====
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrBuscar ventana = new fmrBuscar();
                ventana.setVisible(true);
            }
        });


        // ===== BOTÓN MATERIALES =====
        btnMateriales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrMateriales ventana = new fmrMateriales();
                ventana.setVisible(true);
            }
        });
    }

}
