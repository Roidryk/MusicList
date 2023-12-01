package ProyectoPaquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class Controlador {

	 private Modelo modelo;
	    private Vista vista;

	    public Controlador(Modelo modelo, Vista vista) {
	        this.modelo = modelo;
	        this.vista = vista;

	        this.vista.agregarListener(new BotonClickListener());
	    }

	    class BotonClickListener implements ActionListener {
	      
	        
	        	 public void actionPerformed(ActionEvent e) {
	        	        if (e.getSource() instanceof JButton) {
	        	            JButton boton = (JButton) e.getSource();
	        	            String genero = boton.getText(); 
	        	            String[] canciones = modelo.obtenerCanciones(genero);
	        	            vista.mostrarCanciones(canciones);
	        	        }
	        }
	    }
}
