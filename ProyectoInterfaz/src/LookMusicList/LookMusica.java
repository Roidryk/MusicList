package LookMusicList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import VistaMusicList.VistaMusica;

public class LookMusica {

	public static void aplicarConfiguracionMusicList(VistaMusica vista, String titulo, Color colorFondo, Color colorBoton, String textoLabel) {
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
