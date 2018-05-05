package interfaz;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.*;

public class VentanaPacman extends JFrame{

	private DialogoPrincipal v;
	
	public VentanaPacman(DialogoPrincipal v) {
		
		this.v = v;
		setIconImage(new ImageIcon("./data/icon.png").getImage());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(500,500));
		pack();
		centrar();
	}
	
	public void centrar() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension d = this.getSize();
		int x = (int) ((screenSize.width / 2) - (d.width / 2));
		int y = (int) ((screenSize.height / 2) - (d.height / 2));		
		setLocation(x,y);
	}

	public void cargarJuego(File f) {
		
	}

	public void setNombreJugador(String s) {
		
	}
}
