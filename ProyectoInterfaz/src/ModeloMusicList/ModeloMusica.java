package ModeloMusicList;

import java.util.ArrayList;
/**
 * Modelo para la aplicación MusicList.
 */
public class ModeloMusica {
	/**
     * Obtiene las canciones según el género especificado.
     * 
     * @param genero El género de las canciones.
     * @return Un array de cadenas con las canciones del género especificado.
     */
	private String[] cancionesPop = { "Canción 1", "Canción 2", "Canción 3" };
	private String[] cancionesRock = { "Canción 4", "Canción 5", "Canción 6" };
	private String[] cancionesJazz = { "Canción 7", "Canción 8", "Canción 9" };
	private String[] cancionesHipHop = { "Canción 10", "Canción 11", "Canción 12" };
	
	public String[] obtenerCanciones(String genero) {
		// Implementación del método
		switch (genero) {
		case "Pop":
			return cancionesPop;
		case "Rock":
			return cancionesRock;
		case "Jazz":
			return cancionesJazz;
		case "HipHop":
			return cancionesHipHop;

		default:
			return new String[] {};
		}
	}

}
