package ProyectoPaquete;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vista vista1 =  new Vista();
     Modelo modelo1 = new Modelo();
     Controlador controlador = new Controlador(modelo1,vista1);
     
      vista1.setVisible(true);
     
     
	}

}
