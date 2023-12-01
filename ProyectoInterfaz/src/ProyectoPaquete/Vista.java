package ProyectoPaquete;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Vista extends JFrame {
	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JButton btnPop = new JButton("Pop");
	    private JButton btnRock = new JButton("Rock");
	    private JButton btnJazz = new JButton("Jazz");
	    private JButton btnHipHop = new JButton("HipHop");

	    public Vista() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	        panelBotones.add(btnJazz);
	        panelBotones.add(btnHipHop);
	    }

	    public void agregarListener(ActionListener listener) {
	        btnPop.addActionListener(listener);
	        btnRock.addActionListener(listener);
	        btnJazz.addActionListener(listener);
	        btnHipHop.addActionListener(listener);
	    }

	    public String obtenerGenero(ActionEvent e) {
	        if (e.getSource() instanceof JButton) {
	            return ((JButton) e.getSource()).getText();
	        }
	        return "";
	    }

	    public void mostrarCanciones(String[] canciones) {
	        JFrame frameCanciones = new JFrame("Lista de Canciones");
	        frameCanciones.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frameCanciones.setSize(300, 200);

	        JPanel panelCanciones = new JPanel();
	        panelCanciones.setLayout(new BoxLayout(panelCanciones, BoxLayout.Y_AXIS));

	        for (String cancion : canciones) {
	            JLabel labelCancion = new JLabel(cancion);
	            panelCanciones.add(labelCancion);
	        }

	        JScrollPane scrollPane = new JScrollPane(panelCanciones);
	        frameCanciones.getContentPane().add(scrollPane);

	        frameCanciones.setVisible(true);
	    }

}
