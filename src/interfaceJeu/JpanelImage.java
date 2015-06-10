package interfaceJeu;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;


public class JpanelImage extends JPanel{
private Image image;

public JpanelImage(Image image){
	this.image = image;
	Dimension size = new Dimension(this.getWidth(), this.getHeight());
	this.setPreferredSize(size);
	this.setMaximumSize(size);
	this.setMinimumSize(size);
	this.setSize(size);
	this.setLayout(null);
}
public void paintComponent(Graphics g){
	g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(),this);
}

}
