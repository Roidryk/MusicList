package VistaMusicList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaMusica extends JFrame {
	private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JButton btnPopMusic = new JButton("Pop");
    public JButton btnRockMusic = new JButton("Rock");
    public JButton btnJazzMusic = new JButton("Jazz");
    public JButton btnHipHopMusic = new JButton("HipHop");
    public JLabel lblTituloMusicList = new JLabel("", SwingConstants.CENTER);
    public VistaMusica() {
        
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(4, 1));

       
       // JLabel lblTitulo = new JLabel("MusicList", SwingConstants.CENTER);
        contentPane.add(lblTituloMusicList);

      
        JPanel panelBotonesMusicList = new JPanel();
        contentPane.add(panelBotonesMusicList);
        panelBotonesMusicList.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

       
        panelBotonesMusicList.add(btnPopMusic);
        panelBotonesMusicList.add(btnRockMusic);
        panelBotonesMusicList.add(btnJazzMusic);
        panelBotonesMusicList.add(btnHipHopMusic);
    }

    public void agregarListener(ActionListener listener) {
        btnPopMusic.addActionListener(listener);
        btnRockMusic.addActionListener(listener);
        btnJazzMusic.addActionListener(listener);
        btnHipHopMusic.addActionListener(listener);
    }

    public String obtenerGenero(String textoBoton) {
        return textoBoton;
    }

    public void mostrarCanciones(String[] canciones, JFrame frameCanciones) {
        
        setOperacionCierreVentanaCanciones(frameCanciones, frameCanciones.getDefaultCloseOperation());

        frameCanciones.setSize(300, 200);

        JPanel panelCancionesMusicList = new JPanel();
        panelCancionesMusicList.setLayout(new BoxLayout(panelCancionesMusicList, BoxLayout.Y_AXIS));

        for (String cancion : canciones) {
            JLabel labelCancion = new JLabel(cancion);
            panelCancionesMusicList.add(labelCancion);
        }

        JScrollPane MostrarListaMusica = new JScrollPane(panelCancionesMusicList);
        frameCanciones.add(MostrarListaMusica);

        frameCanciones.setVisible(true);
    }

    public void setOperacionCierrePrincipal(int operacion) {
        setDefaultCloseOperation(operacion);
    }

    public void setOperacionCierreVentanaCanciones(JFrame frameCanciones, int operacion) {
        frameCanciones.setDefaultCloseOperation(operacion);
    }
    public void setLabelText(String texto) {
        lblTituloMusicList.setText(texto);
    }
}
