package ProyectoInterfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Controlador {

	 private Modelo modelo;
	    private Vista vista;

	    public Controlador(Modelo modelo, Vista vista) {
	        this.modelo = modelo;
	        this.vista = vista;

	        this.vista.agregarListener(new BotonClickListener());
	        this.vista.setDefaultCloseOperation(this.vista.EXIT_ON_CLOSE);
	    }

	    class BotonClickListener implements ActionListener {
	      
	        
	        	 public void actionPerformed(ActionEvent e) {
	        	        if (e.getSource() instanceof JButton) {
	        	            JButton boton = (JButton) e.getSource();
	        	            String genero = boton.getText(); 
	        	            String[] canciones = modelo.obtenerCanciones(genero);
	        	            JFrame frameCanciones = new JFrame("Lista de canciones");
	        	            vista.mostrarCanciones(canciones, frameCanciones);
	        	            int decision = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la ventana de canciones?");
	                        if (decision == JOptionPane.YES_OPTION) { 
	                         
	                            
	                        } else {
	                            
	                            //vista.setOperacionCierreVentanaCanciones(frameCanciones, JFrame.DO_NOTHING_ON_CLOSE);
	                        }
	        	        }
	        	 }
	        	 
	    }
	   
}
