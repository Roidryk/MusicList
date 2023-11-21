package ProyectoPaquete;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{

    JPanel contentPane;
    JTextField textNombre;
    JTextField textApellidos;
    
    public Vista() {
    	initComponentes();
    }
    
    public void initComponentes() {
    	 setTitle("Mi Aplicacion");
    	
    }
}
