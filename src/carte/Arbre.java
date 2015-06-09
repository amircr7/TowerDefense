package carte;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Arbre extends Decors{
	public Arbre()throws IOException{ 
	super(ImageIO.read(new File ("arbre/chemin.jpg")));
	}
}
