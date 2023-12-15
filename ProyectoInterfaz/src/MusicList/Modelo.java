package MusicList;

import java.util.ArrayList;

public class Modelo {
	private String[] cancionesPop = { "Canción 1", "Canción 2", "Canción 3" };
	private String[] cancionesRock = { "Canción 4", "Canción 5", "Canción 6" };
	private String[] cancionesJazz = { "Canción 7", "Canción 8", "Canción 9" };
	private String[] cancionesHipHop = { "Canción 10", "Canción 11", "Canción 12" };

	public String[] obtenerCanciones(String genero) {
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
