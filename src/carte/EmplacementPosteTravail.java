package carte;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EmplacementPosteTravail extends Case{
	public EmplacementPosteTravail() throws IOException{
		super(ImageIO.read(new File ("Images/poste.jpg")));
	}

}
