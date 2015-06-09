package carte;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Dalle extends Chemin{
	public Dalle() throws IOException{
		super(ImageIO.read(new File ("Images/chemin.jpg")));
	}
	
}
