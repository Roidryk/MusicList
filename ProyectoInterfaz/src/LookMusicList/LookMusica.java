package LookMusicList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import VistaMusicList.VistaMusica;
/**
 * Clase que configura el aspecto (look) de la aplicación MusicList.
 */
public class LookMusica {

	  /**
     * Aplica la configuración de aspecto a la vista.
     *
     * @param vista La vista de la aplicación.
     * @param titulo El título de la aplicación.
     * @param colorFondo El color de fondo de la aplicación.
     * @param colorBoton El color de los botones de la aplicación.
     * @param textoLabel El texto del título en la vista.
     */
	public static void aplicarConfiguracionMusicList(VistaMusica vista, String titulo, Color colorFondo, Color colorBoton, String textoLabel) {
		 // Implementación del método
		aplicarTituloMusicList(vista, titulo);
        aplicarColorFondoMusicList(vista, colorFondo);
        aplicarColorBotonMusicList(vista, colorBoton);
        aplicarTextoLabelMusicList(vista, textoLabel);
    }

    private static void aplicarTituloMusicList(VistaMusica vista, String titulo) {
        if (titulo != null) {
            vista.setTitle(titulo);
        }
    }

    private static void aplicarColorFondoMusicList(VistaMusica vista, Color color) {
        if (color != null) {
            vista.getContentPane().setBackground(color);
        }
    }

    private static void aplicarColorBotonMusicList(VistaMusica vista, Color color) {
        if (color != null) {
            vista.btnPopMusic.setBackground(color);
            vista.btnRockMusic.setBackground(color);
            vista.btnJazzMusic.setBackground(color);
            vista.btnHipHopMusic.setBackground(color);
        }
    }

    private static void aplicarTextoLabelMusicList(VistaMusica vista, String texto) {
        if (texto != null) {
            vista.setLabelText(texto);
        }
    }

}
