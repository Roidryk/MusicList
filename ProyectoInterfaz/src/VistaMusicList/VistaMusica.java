package VistaMusicList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Vista para la aplicación MusicList.
 */
public class VistaMusica extends JFrame {
	
	private static final long serialVersionUID = 1L;
	/**
     * Panel de contenido.
     */
    public JPanel contentPane;
    /**
     * Botón para el género Pop.
     */
    public JButton btnPopMusic = new JButton("Pop");

    /**
     * Botón para el género Rock.
     */
    public JButton btnRockMusic = new JButton("Rock");
    /**
     * Botón para el género Jazz.
     */
    public JButton btnJazzMusic = new JButton("Jazz");
    
    /**
     * Botón para el género HipHop.
     */
    public JButton btnHipHopMusic = new JButton("HipHop");
    /**
     * Etiqueta de título en la vista.
     */
    public JLabel lblTituloMusicList = new JLabel("", SwingConstants.CENTER);
    /**
     * Constructor de la vista.
     */
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
    /**
     * Agrega un ActionListener a los botones de la vista.
     * 
     * @param listener El ActionListener a agregar.
     */
    public void agregarListener(ActionListener listener) {
        btnPopMusic.addActionListener(listener);
        btnRockMusic.addActionListener(listener);
        btnJazzMusic.addActionListener(listener);
        btnHipHopMusic.addActionListener(listener);
    }
    /**
     * Obtiene el género de música asociado a un botón.
     * 
     * @param textoBoton El texto del botón.
     * @return El género de música asociado al botón.
     */
    public String obtenerGenero(String textoBoton) {
        return textoBoton;
    }
    /**
     * Muestra una lista de canciones en una nueva ventana.
     * 
     * @param canciones El array de cadenas con las canciones a mostrar.
     * @param frameCanciones La ventana en la que se mostrarán las canciones.
     */
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
    /**
     * Establece la operación de cierre para la ventana principal.
     *
     * @param operacion Operación de cierre.
     */
    public void setOperacionCierrePrincipal(int operacion) {
        setDefaultCloseOperation(operacion);
    }
    /**
     * Establece la operación de cierre para la ventana de canciones.
     *
     * @param frameCanciones Ventana de canciones.
     * @param operacion Operación de cierre.
     */
    public void setOperacionCierreVentanaCanciones(JFrame frameCanciones, int operacion) {
        frameCanciones.setDefaultCloseOperation(operacion);
    }
    /**
     * Establece el texto de la etiqueta.
     *
     * @param texto Texto a establecer.
     */
    public void setLabelText(String texto) {
        lblTituloMusicList.setText(texto);
    }
}
