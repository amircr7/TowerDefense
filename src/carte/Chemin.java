package carte;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Chemin extends Case{
	public Chemin() throws IOException{
		super(ImageIO.read(new File ("Images/chemin.jpg")));
	}
	
}
