package ProyectoPaquete;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vista vista1 =  new Vista();
     Modelo modelo1 = new Modelo();
     Controlador controlador = new Controlador(vista1,modelo1);
     PantallaCarga carga = new PantallaCarga();
      vista1.setVisible(true);
     
     
	}

}
