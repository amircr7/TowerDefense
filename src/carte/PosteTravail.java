package carte;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PosteTravail extends EmplacementPosteTravail{
	public PosteTravail() throws IOException{
		super(ImageIO.read(new File ("Images/poste.jpg")));
	}

}
