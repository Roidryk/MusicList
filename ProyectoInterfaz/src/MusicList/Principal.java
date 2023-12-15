package MusicList;

import ModeloMusicList.ModeloMusica;
import VistaMusicList.VistaMusica;
import controladorMusicList.ControladorMusica;

import java.awt.Color;

import LookMusicList.LookMusica;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     VistaMusica vistaMusicList =  new VistaMusica();
     ModeloMusica modeloMusicList = new ModeloMusica();
     ControladorMusica controladorMusicList = new ControladorMusica(modeloMusicList,vistaMusicList);
     LookMusica.aplicarConfiguracionMusicList(vistaMusicList, "Mi Aplicación", Color.WHITE, Color.GREEN, "MusicList");

      vistaMusicList.setVisible(true);

     
	}

}
