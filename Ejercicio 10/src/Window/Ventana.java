package Window;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		//Permite modificar la visibilidad de la ventana
		this.setVisible(true);
		
		//Modifica el tamaño
		this.setSize(600,600);
		
		//Modifica la ubicacion de la ventana
		this.setLocation(100,100);
		
		//Permite cerrar la ventana completamente
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//No permite modificar el tamaño
		this.setResizable(false);
		
		//Modifica el nombre de la ventana
		this.setTitle("Mi ventana");
		;
		//Dimensiones
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(750,750));
		
		//Centrar(Siempre y cuando sea null)
		this.setLocationRelativeTo(null);
		
		//Llamar funcion
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.BLUE);
		this.add(login);
	}
}
