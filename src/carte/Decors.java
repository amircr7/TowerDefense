package carte;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Decors extends Case{
	public Decors()throws IOException{ 
	super(ImageIO.read(new File ("Images/arbre.gif")));
	}
}
