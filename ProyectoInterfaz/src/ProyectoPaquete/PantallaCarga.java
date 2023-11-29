package ProyectoPaquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.SplashScreen;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class PantallaCarga extends JDialog{
	 private JProgressBar barraProgreso;
	 
	   public PantallaCarga() {
	      setBounds(100, 100, 637, 566);
	      JPanel contentPane = new JPanel();
	      contentPane.setLayout(new BorderLayout());
	      setContentPane(contentPane);
	 
	     
	      JLabel lblImagen = new JLabel();
	     
	      lblImagen.setIcon(new ImageIcon(SplashScreen.class.getResource("/gui/splash.jpg")));
	      contentPane.add(lblImagen, BorderLayout.CENTER);
	 
	      
	      JPanel panelInferior = new JPanel();
	      panelInferior.setLayout(new GridLayout(2, 1, 0, 0));
	      barraProgreso = new JProgressBar();
	    
	      barraProgreso.setStringPainted(true);
	      panelInferior.add(barraProgreso);
	 
	      JLabel lblFersoft = new JLabel("FerSoft 2020");
	      lblFersoft.setForeground(Color.BLUE);
	      lblFersoft.setHorizontalAlignment(SwingConstants.CENTER);
	      panelInferior.add(lblFersoft);
	 
	      contentPane.add(panelInferior, BorderLayout.SOUTH);
	 
	      setResizable(false); 
	      setUndecorated(true); 
	      setLocationRelativeTo(null); 
	      setVisible(true);
	 
	      try {
	         iniciarBarraCarga();
	      } catch (InterruptedException e) {
	         throw new RuntimeException(e);
	      }
	     
	      dispose();
	   }
	 
	   private void iniciarBarraCarga() throws InterruptedException {
	      for(int i = 0; i <= 100; i++){
	         Thread.sleep(20);
	         actualizarBarraProgreso(i);
	      }
	   }
	 
	   private void actualizarBarraProgreso(int valor) {
	      SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            barraProgreso.setValue(valor);
	         }
	      });
	   }
}
