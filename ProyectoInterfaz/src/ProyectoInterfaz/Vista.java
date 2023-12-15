package ProyectoInterfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btnPop = new JButton("Pop");
    private JButton btnRock = new JButton("Rock");
    private JButton btnOtros1 = new JButton("Jazz");
    private JButton btnOtros2 = new JButton("HipHop");

    public Vista() {
        
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(4, 1));

       
        JLabel lblTitulo = new JLabel("MusicList", SwingConstants.CENTER);
        contentPane.add(lblTitulo);

      
        JPanel panelBotones = new JPanel();
        contentPane.add(panelBotones);
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

       
        panelBotones.add(btnPop);
        panelBotones.add(btnRock);
        panelBotones.add(btnOtros1);
        panelBotones.add(btnOtros2);
    }

    public void agregarListener(ActionListener listener) {
        btnPop.addActionListener(listener);
        btnRock.addActionListener(listener);
        btnOtros1.addActionListener(listener);
        btnOtros2.addActionListener(listener);
    }

    public String obtenerGenero(String textoBoton) {
        return textoBoton;
    }

    public void mostrarCanciones(String[] canciones, JFrame frameCanciones) {
        
        setOperacionCierreVentanaCanciones(frameCanciones, frameCanciones.getDefaultCloseOperation());

        frameCanciones.setSize(300, 200);

        JPanel panelCanciones = new JPanel();
        panelCanciones.setLayout(new BoxLayout(panelCanciones, BoxLayout.Y_AXIS));

        for (String cancion : canciones) {
            JLabel labelCancion = new JLabel(cancion);
            panelCanciones.add(labelCancion);
        }

        JScrollPane scrollPane = new JScrollPane(panelCanciones);
        frameCanciones.add(scrollPane);

        frameCanciones.setVisible(true);
    }

    public void setOperacionCierrePrincipal(int operacion) {
        setDefaultCloseOperation(operacion);
    }

    public void setOperacionCierreVentanaCanciones(JFrame frameCanciones, int operacion) {
        frameCanciones.setDefaultCloseOperation(operacion);
    }
}
