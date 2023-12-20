package MusicList;

import ModeloMusicList.ModeloMusica;
import VistaMusicList.VistaMusica;
import controladorMusicList.ControladorMusica;
import java.awt.Color;

import LookMusicList.LookMusica;

/**
 * Clase principal que inicia la aplicación MusicList.
 * 
 */
public class Principal {
	/**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
	public static void main(String[] args) {
		// Implementación del método
		// TODO Auto-generated method stub
     VistaMusica vistaMusicList =  new VistaMusica();
     ModeloMusica modeloMusicList = new ModeloMusica();
     ControladorMusica controladorMusicList = new ControladorMusica(modeloMusicList,vistaMusicList);
     LookMusica.aplicarConfiguracionMusicList(vistaMusicList, "Mi Aplicación", Color.WHITE, Color.GREEN, "MusicList");

      vistaMusicList.setVisible(true);

     
	}

}
