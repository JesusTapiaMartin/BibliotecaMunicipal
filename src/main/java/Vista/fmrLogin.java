package Vista;

import Clases.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fmrLogin extends JFrame{

    // ===== ATRIBUTOS =====
    private JPanel jpLogin;
    private JTextField      txtNombre;
    private JLabel          lblTitulo;
    private JPasswordField  txtpContraseña;
    private JLabel          lblNombre;
    private JLabel          lblContraseña;
    private JButton         btnIngresar;
    private JButton         crearCuentaButton;


    public fmrLogin(){
        setVisible(true);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Login");
        setContentPane(jpLogin);

        // ===== BOTÓN INICIAR SESIÓN =====
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        // ===== BOTÓN CREAR USUARIO =====
        crearCuentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
