package MusicList;

import ModeloMusicList.ModeloMusica;
import VistaMusicList.VistaMusica;
import controladorMusicList.ControladorMusica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     VistaMusica vista1 =  new VistaMusica();
     ModeloMusica modelo1 = new ModeloMusica();
     ControladorMusica controlador = new ControladorMusica(modelo1,vista1);
     
      vista1.setVisible(true);
     System.out.println("Hola");
     
	}

}
