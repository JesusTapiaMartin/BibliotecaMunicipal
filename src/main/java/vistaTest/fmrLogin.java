package vistaTest;

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

        setSize(1024, 768);
        setLocationRelativeTo(null);
        setTitle("Menú");
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
