package img;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(Fondo.class.getResource("/img/hand.jpeg"));
		g.drawImage(imagenFondo.getImage(),0,0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
	
}
